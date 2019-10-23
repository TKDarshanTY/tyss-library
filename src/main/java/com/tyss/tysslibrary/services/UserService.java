package com.tyss.tysslibrary.services;

import java.util.List;

import com.tyss.tysslibrary.dto.Book;

public interface UserService {
	public List<Book> searchBook(String bName);
	public List<Book> requestBook(int id);
	public List<Book> getAllBook();
}
