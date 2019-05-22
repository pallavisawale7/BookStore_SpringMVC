package com.cts.dao;

import com.cts.entity.Book;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("bookDAO")

public class BookDAOImpl implements BookDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override

	public void saveBook(com.cts.entity.Book book){
//		sessionFactory.getCurrentSession().save(book);
		sessionFactory.getCurrentSession().saveOrUpdate(book);
		System.out.println("Data Saved");
	}
	
	@Override
	@Transactional
	public List<com.cts.entity.Book> listBook() {
		System.out.println("Hello" +sessionFactory);
		System.out.println(" From dao list");
		 Session session=sessionFactory.getCurrentSession();
		 
		  	CriteriaBuilder cb=session.getCriteriaBuilder();
		  	CriteriaQuery<Book> cq=cb.createQuery(Book.class);
		  	Root<Book> root=cq.from(Book.class);
		  	cq.select(root);
		  	Query query=session.createQuery(cq);
		  	return query.getResultList();
		  
	}
	@Override
	public com.cts.entity.Book getBook(int theId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
