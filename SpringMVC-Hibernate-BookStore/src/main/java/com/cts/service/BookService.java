package com.cts.service;

import com.cts.entity.Book;
import java.util.List;

public interface BookService {

	void saveBook(Book book);
	Book getBook(int theId);
	void deleteBook(int id);
	List<Book> listAllBook();
}
