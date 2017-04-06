package kr.co.test.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.test.service.BoardService;
import kr.co.test.vo.Board;
import kr.co.test.vo.BoardForm;
import kr.co.test.vo.User;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping(value="/addContent.ss", method=RequestMethod.GET)
	public String addContentForm(Model model){
		model.addAttribute("boardForm", new BoardForm());
		return "addContent";
	}
	
	@RequestMapping(value="/addContent.ss", method=RequestMethod.POST)
	public String addContent(@Valid BoardForm boardForm, Errors errors, HttpSession session){
		Board board = new Board();
		BeanUtils.copyProperties(boardForm, board);
		System.out.println(boardForm);
			
		User user = (User)session.getAttribute("LOGINUSER");
		System.out.println(user);
		board.setWriter(user.getId());
		System.out.println(board);
		boardService.addBoard(board);
		
		return "redirect:/home.ss";
	}
}
