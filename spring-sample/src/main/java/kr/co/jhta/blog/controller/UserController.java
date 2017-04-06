package kr.co.jhta.blog.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.jhta.blog.service.UserService;
import kr.co.jhta.blog.vo.User;
import kr.co.jhta.blog.vo.UserForm;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="login.blog", method=RequestMethod.POST)
	public String getUser(String id,String pwd, HttpSession session) {
		User user = userService.getUser(id);
		
		if (user == null){
			return "redirect:/login.blog?error=invalid";
		}
		if (!user.getPwd().equals(pwd)){
			return "redirect:/login.blog?error=invalid";
		}
		session.setAttribute("LOGINUSER", user);
		
		return "redirect:/home.blog";
	}
	
	@RequestMapping(path="login.blog", method=RequestMethod.GET)
	public String loginUser(){
		return "login";
	}
	
	
	
	@RequestMapping(path="addUser.blog", method=RequestMethod.GET)
	public String addUser(Model model){
		
		model.addAttribute("userForm", new UserForm());
		return "addUser";
	}
	
	@RequestMapping(path="addUser.blog", method=RequestMethod.POST)
	public String registerUser(@Valid UserForm userForm, Errors error){
		User user = new User();
		
		System.out.println(userForm);
		
		BeanUtils.copyProperties(userForm, user);
		userService.addUser(user);
		// 구현
		return "redirect:/home.blog";
	}
	@RequestMapping("logout.blog")
	public String logoutUser(HttpSession session){
		
		session.invalidate();
		
		return "redirect:/home.blog";
	}
	
	
}
