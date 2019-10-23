package com.tyss.tysslibrary.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.tyss.tysslibrary.dto.Book;

@Repository
public class BookDaoImpl implements BookDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addBook(Book book) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println(book.getbAuthor());
		try {
			transaction.begin();
			manager.persist(book);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean removeBook(int bId) {
		return false;
	}

	@Override
	public List<Book> getAllBook() {
		return null;
	}

	@Override
	public Book searchBook(String bName) {
		return null;
	}

}
