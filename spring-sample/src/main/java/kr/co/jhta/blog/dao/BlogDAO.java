package kr.co.jhta.blog.dao;

import java.util.List;

import kr.co.jhta.blog.vo.Blog;

public interface BlogDAO {

	void addBlog(Blog blog);

	List<Blog> searchBlog(String id);

	List<Blog> searchBlogByNo(int no);

}
