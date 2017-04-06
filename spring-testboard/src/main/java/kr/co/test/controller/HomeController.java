package kr.co.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.test.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping("/home.ss")
	public String home (Model model) {
		model.addAttribute("boardList", boardService.getAllBoardList());
		return "home";
	}
	
}
