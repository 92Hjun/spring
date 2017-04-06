package kr.co.jhta.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.blog.dao.BlogDAO;
import kr.co.jhta.blog.vo.Blog;
@Service
public class BlogServiceImpl implements BlogService{
	
	@Autowired
	private BlogDAO blogDAO;
	
	@Override
	public void addBlog(Blog blog) {
		
		blogDAO.addBlog(blog);
	}

	@Override
	public List<Blog> searchBlog(String id) {
		
		return blogDAO.searchBlog(id);
	}

	@Override
	public List<Blog> searchBlogByNo(int no) {
		
		return blogDAO.searchBlogByNo(no);
	}

	
}
