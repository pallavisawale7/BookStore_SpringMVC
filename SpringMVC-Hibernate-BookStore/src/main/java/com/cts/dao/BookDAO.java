package com.cts.dao;

import com.cts.entity.Book;
import java.util.List;

public interface BookDAO {
	void saveBook(Book book);
	List<Book> listBook();
	Book getBook(int theId);
	void deleteBook(int id);

}
