package kr.co.jhta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 웹 mvc 에서 controller 역할을 한다고 Spring이 인지한다.
@Controller
public class HomeController {
	
	@Autowired
	private JSONview jsonView;
	
	@Autowired
	private ExcelView excelView;
	
	@RequestMapping("/home.do")
	public String home(Model model) {
		
		model.addAttribute("msg", "반갑습니다.");
		return "home";
		
	}
	
	@RequestMapping("/about.do") // 맵핑할 url url요청이 오면 아래 메소드가 실행되서 응답이 내려간다.
	public ModelAndView about(){
		
		ModelAndView mav = new ModelAndView();
		
		// ModelAndView 객체에 데이터 담기
		mav.addObject("question1", "회원가입 과정이 궁금해요");
		mav.addObject("question2", "탈퇴는 어떻게 하나요?");
		
		// 이동할 뷰페이지 설정하기
		mav.setViewName("about");
		
		return mav;
		
	}
	
	@RequestMapping("/help.do")
	public String c(){
		
		return "help";
	}
	
	@RequestMapping("/data.do")
	public ModelAndView d(){
		
		ModelAndView mav = new ModelAndView();
		mav.setView(jsonView);
		
		mav.addObject("data", new int[]{100,50,40,80,90,70,50,60,30,1,50,60,60});
		
		return mav;
	}
	
	@RequestMapping("/xls.do")
	public ModelAndView e(){
		ModelAndView mav = new ModelAndView();
		mav.setView(excelView);
		mav.addObject("data", new String[]{"Jane", "Adam", "Tayler"});
		return mav;
	}
}
