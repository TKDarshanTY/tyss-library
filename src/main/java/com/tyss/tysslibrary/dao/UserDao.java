package com.tyss.tysslibrary.dao;

import java.util.List;

import com.tyss.tysslibrary.dto.Book;

public interface UserDao {
	public List<Book> searchBook(String bName);
	public List<Book> requestBook(int id);
	public List<Book> getAllBook();
}
