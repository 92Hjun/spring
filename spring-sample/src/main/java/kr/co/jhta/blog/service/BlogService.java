package kr.co.jhta.blog.service;

import java.util.List;

import kr.co.jhta.blog.vo.Blog;

public interface BlogService {

	void addBlog(Blog blog);

	List<Blog> searchBlog(String id);

	List<Blog> searchBlogByNo(int no);


}
