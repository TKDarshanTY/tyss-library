package com.tyss.tysslibrary.services;

import java.util.List;

import com.tyss.tysslibrary.dto.Book;
import com.tyss.tysslibrary.dto.User;

public interface UserService {
	public boolean registerUser(User user);
	public List<Book> searchBook(String bName);
	public List<Book> requestBook(int id);
	public List<Book> getAllBook();
}
