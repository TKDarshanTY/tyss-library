package com.tyss.tysslibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.tysslibrary.dao.UserDao;
import com.tyss.tysslibrary.dto.Book;
import com.tyss.tysslibrary.dto.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao dao;
	
	@Override
	public List<Book> searchBook(String bName) {
		// TODO Auto-generated method stub
		return dao.searchBook(bName);
	}

	@Override
	public List<Book> requestBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBook() {
		return dao.getAllBook();
	}

	@Override
	public boolean registerUser(User user) {
		return dao.registerUser(user);
	}

}
