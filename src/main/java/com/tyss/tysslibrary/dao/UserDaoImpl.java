package com.tyss.tysslibrary.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import com.tyss.tysslibrary.dto.Book;

public class UserDaoImpl implements UserDao {
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public List<Book> searchBook(String bName) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String get="from Book where bName like '%=:bName%'";
		Query query=manager.createQuery(get);
		query.setParameter("bName", bName);
		List<Book> list=query.getResultList();
		if(list==null) {
			return null;
		}
		return list;
	
	}

	@Override
	public List<Book> requestBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBook() {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		String get="from Book";
		Query query=manager.createQuery(get);
		List<Book> list=query.getResultList();
		if(list==null) {
			return null;
		}
		return list;

	
	}
}
