package kr.co.jhta.dao;

import java.util.List;

import kr.co.jhta.vo.Book;

public interface BookDAO {
	List<Book> getAllBooks();
	void addBook(Book Book);
	List<Book> searchBooks(Book book);
}
