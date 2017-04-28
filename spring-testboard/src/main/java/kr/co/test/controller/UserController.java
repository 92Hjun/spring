package kr.co.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.test.vo.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/login.ss", method=RequestMethod.GET)
	public String loginForm(){
		return "login";
	}
	@RequestMapping(value="/login.ss", method=RequestMethod.POST)
	public String login(String id, String pwd, HttpSession session){
		if (id.equals("ss") || pwd.equals("ss")){
			User user = new User();
			
			user.setId(id);
			user.setPwd(pwd);
			user.setUserEmpty("S");
			user.setDepartment("Q");
			session.setAttribute("LOGINUSER", user);
			
		}else {
			return "redirect:/login.ss?err=deny";
		}
		
		return "redirect:/home.ss";
	}
	
}
