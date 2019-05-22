package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.BookDAO;
import com.cts.entity.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	@Transactional
	public void saveBook(Book book)
	{
		System.out.println("Save from service");
		bookDAO.saveBook(book);
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

	@Override
	@Transactional
	public List<com.cts.entity.Book> listAllBook() {
			return bookDAO.listBook();
		
		}
	}




	

