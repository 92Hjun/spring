package kr.co.jhta.blog.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.co.jhta.blog.service.BlogService;
import kr.co.jhta.blog.view.JsonView;
import kr.co.jhta.blog.vo.Blog;
import kr.co.jhta.blog.vo.BlogForm;
import kr.co.jhta.blog.vo.User;

@Controller
public class BlogController {
	
	private String directory ="C:\\spring_project\\workspace\\spring-sample\\src\\main\\webapp\\resources\\images";
	
	
	@Autowired
	private JsonView jsonView;
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping(path="/addLeaf.blog",method=RequestMethod.GET)
	public String addBlog(Model model) {
		model.addAttribute("blogForm", new BlogForm());
		return "addBlog";
	}
	
	@RequestMapping(path="/addLeaf.blog",method=RequestMethod.POST)
	public String registerBlog(@Valid BlogForm blogForm, Errors error, HttpSession session) throws Exception{
		
		if (error.hasErrors()){
			return "redirect:/addLeaf.blog?error=invalid";
		}
		
		Blog blog = new Blog();
		BeanUtils.copyProperties(blogForm, blog);
		System.out.println(blogForm.getCategory());
		MultipartFile upfile = blogForm.getUploadFile();
		User user = new User();
		user = (User)session.getAttribute("LOGINUSER");
		
		if (!upfile.isEmpty()){
			String fileName = upfile.getOriginalFilename();
			blog.setUpFile(fileName);
			IOUtils.copy(upfile.getInputStream(), new FileOutputStream(new File(directory, fileName)));
		}
		blog.setWriter(user.getId());
		
		
		blogService.addBlog(blog);
		
		return "redirect:/home.blog";
	}
	
	@RequestMapping(path="/search.blog",method=RequestMethod.GET)
	public ModelAndView searchBlog(@RequestParam("cat")int catNo, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", blogService.searchBlogByNo(catNo));
		mav.setView(jsonView);
		return mav;
		
	}
}
