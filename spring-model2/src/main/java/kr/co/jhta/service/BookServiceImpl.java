package kr.co.jhta.service;

import java.util.List;

import kr.co.jhta.dao.BookDAO;
import kr.co.jhta.vo.Book;

public class BookServiceImpl implements BookService{
	private BookDAO bookDAO;
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	@Override
	public List<Book> findAllBooks() {
		List<Book> bookList = bookDAO.getAllBooks();
		return bookList; 
	}
	
	@Override
	public void addBook(Book book) {
		List<Book> bookList = bookDAO.getAllBooks();
		
		boolean isExist = false;
		for (Book b : bookList){
			if (b.getTitle().equals(book.getTitle())){
				isExist = true;
				break;
			}
		}
		
		if (!isExist) {
			bookDAO.addBook(book);
		}
	}
	@Override
	public List<Book> searchBooks(Book book) {
		List<Book> bookList = bookDAO.searchBooks(book);
		return bookList;
	}
	
}
