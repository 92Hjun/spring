package kr.co.jhta.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Book;

public class BookDAOImpl implements BookDAO{
	
	private SqlMapClientTemplate template;
	
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllBooks() {
		return template.queryForList("getAllBook");
	}
	
	public void addBook(Book book) {
		template.insert("abbBook", book);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Book> searchBooks(Book book) {
		return template.queryForList("searchBooks", book);
	}
}
