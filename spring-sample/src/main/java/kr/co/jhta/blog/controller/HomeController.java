package kr.co.jhta.blog.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.blog.service.BlogService;
import kr.co.jhta.blog.vo.Blog;
import kr.co.jhta.blog.vo.User;


@Controller
public class HomeController {
	
	@Autowired
	private BlogService blogService;
	
	
	@RequestMapping(path="/home.blog")
	public String beforeHome (HttpSession session, Model model){
		
		User user = (User)session.getAttribute("LOGINUSER");
		
		if (!(user == null)){
			List<Blog> blogList = blogService.searchBlog(user.getId());
			model.addAttribute("blogList", blogList);
		}
		
		return "home";
	}
	
	
	
	
}
