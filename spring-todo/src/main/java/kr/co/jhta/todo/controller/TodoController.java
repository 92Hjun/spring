package kr.co.jhta.todo.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

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

import kr.co.jhta.todo.controller.view.FileDownloadView;
import kr.co.jhta.todo.service.TodoService;
import kr.co.jhta.todo.vo.Todo;
import kr.co.jhta.todo.vo.TodoForm;
import kr.co.jhta.todo.vo.User;

@Controller
public class TodoController {
	
	private String directory = "C:\\spring_project\\workspace\\spring-todo\\src\\main\\webapp\\resources\\images\\map";
	
	private String attachDirectory = "C:\\spring_project\\attachment";
	
	@Autowired
	private TodoService todoService;
	
	@Autowired
	private FileDownloadView filedownloadView;
	
	
	@RequestMapping(value="/addtodo.do", method=RequestMethod.GET)
	public String form(Model model){
		model.addAttribute("todoForm", new TodoForm());
		return "registertodo";
	}
	
	@RequestMapping(value="/addtodo.do", method=RequestMethod.POST)
	public String register(@Valid TodoForm todoform, Errors errors, User user) throws Exception{
		
		if(errors.hasErrors()){
			
			return "registertodo";
			
		}
		
		Todo todo = new Todo();
		
		BeanUtils.copyProperties(todoform, todo);
		
		todo.setUser(user);
		
		MultipartFile upfile = todoform.getUploadFile();
		if(!upfile.isEmpty()){
			
			String filename = upfile.getOriginalFilename();
			todo.setMapFilename(filename);
			IOUtils.copy(upfile.getInputStream(), new FileOutputStream(new File(directory, filename)));
			
		}
		
		MultipartFile attachFile = todoform.getAttachFile();
		if(!attachFile.isEmpty()){
			
			String filename = attachFile.getOriginalFilename();
			todo.setAttachFilename(filename);
			IOUtils.copy(attachFile.getInputStream(), new FileOutputStream(new File(attachDirectory, filename)));
			
		}
		
		
		todoService.registerTodo(todo);
		
		return "redirect:/todo.do";
		
	}
	
	@RequestMapping("/todo.do")
	public String todos(Model model, User user){
		
		List<Todo> todoList = todoService.getTodoList(user.getNo());
		model.addAttribute("todoList", todoList);
		
		return "todo";
	}
	
	@RequestMapping("/complete.do")
	public String complete(@RequestParam("no")int no,User user){
		
		todoService.completeTodo(no, user.getNo());
		
		return "redirect:/todo.do";
	}
	@RequestMapping("/download.do")
	public ModelAndView download(@RequestParam("no") int no, User user){
		
		String filename = todoService.getAttachFilename(no, user.getNo());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("directory", attachDirectory);
		mav.addObject("filename", filename);
		
		mav.setView(filedownloadView);
		return mav;
	}
	
}
