package com.tyss.tysslibrary.dao;

import java.util.List;

import com.tyss.tysslibrary.dto.Book;

public interface BookDao {
	public boolean addBook(Book book);

	public boolean removeBook(int bId);

	public List<Book> getAllBook();

	public List<Book> searchBook(String bName);
	
	public boolean updateBook(Book book);
}
