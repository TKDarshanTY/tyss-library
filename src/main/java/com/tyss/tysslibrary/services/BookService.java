package com.tyss.tysslibrary.services;

import java.util.List;

import com.tyss.tysslibrary.dto.Book;

public interface BookService {
	public boolean addBook(Book book);

	public boolean removeBook(int bId);

	public List<Book> getAllBook();

	public Book searchBook(String bName);
}
