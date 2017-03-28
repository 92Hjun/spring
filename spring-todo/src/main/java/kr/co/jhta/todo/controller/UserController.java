package kr.co.jhta.todo.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.jhta.todo.service.UserService;
import kr.co.jhta.todo.vo.User;
import kr.co.jhta.todo.vo.UserForm;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register.do",method=RequestMethod.GET)
	public String form(Model model){
		model.addAttribute("userForm", new UserForm());
		return "registerForm";
	}
	
	/*
	 *	register(@ModelAttribute("userform") @Valid UserForm userform)
	 *		1. 폼입력값을 담기위해서 UserForm 객체를 스프링 생성
	 *		2. 생성된 UserForm객체의 변수명과 일치하는 폼입력값을 저장
	 *		3. @Valid 가 UserForm객체에 저장된값에대한 유효성 체크를 함
	 *		   유효성 체크를 통과하지 못한 항목이 있으면 Errors객체에 에러가 저장된다.
	 *		4. @ModelAttribute는 1번에서 생성한 객체를 Model에 지정된 이름으로 담는다.
	 *		   유효성 체크를 통과하지 못한 경우 입력폼에 기존 입력값을 담고있는 UserForm객체를 
	 *		   registerForm.jsp에게 전달하기 위해서다.
	 *		   @ModelAttribute("userForm") UserForm userForm
	 *		   	--> model.attribute("UserForm", userForm)  
	 */
	
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	public String register(@Valid UserForm userForm, Errors errors){
		
		if (errors.hasErrors()){
			return "registerForm";
		}
		
		User user = new User();
		
		// 변수와 받은 입력값의 path 및 name이 같으면 같은값으로 인식후 알아서 user에 userForm을 담는다.
		BeanUtils.copyProperties(userForm, user);
		
		userService.registerUser(user);
		
		return"redirect:/home.do";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginForm(Model model){
		
		return "loginform";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(String id, String pwd, HttpSession session){
		
		if(StringUtils.isEmpty(id) || StringUtils.isEmpty(pwd)){
			return "redirect:/login.do?error=invalid";
		}
		
		User user = userService.getLoginUserInfo(id, pwd);
		
		session.setAttribute("LOGINUSER", user);
		
		return "redirect:/home.do";
	}
	
	@RequestMapping(value="/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		
		return "redirect:/home.do";
	}
}
