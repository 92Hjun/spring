package com.example.erp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO employeeDao;
	
	@Autowired
	MappingJackson2JsonView jsonView;
	
	@RequestMapping("/search.json")
	public @ResponseBody Result<Employee> search(SearchForm searchForm){
		// 검색 조건과 일치하는 데이터 갯수 조회하기
		int rows = employeeDao.getRowCount(searchForm);
		Pagination pagination = null;
		
		// 현재 페이지번호, 조회된 데이터 갯수로 Pagination 객체 생성하기
		if (searchForm.getDisplay() != 0) {
			
			pagination = new Pagination(searchForm.getDisplay(), searchForm.getPageNo(), rows);
			
		} else {
			
			pagination = new Pagination(searchForm.getPageNo(), rows);
			
		}
			
		// 현재 페이지번호에 해당하는 조회시작번호와 조회끝번호를 SearchForm 에 저장하기 
		searchForm.setBeginIndex(pagination.getBeginIndex());
		searchForm.setEndIndex(pagination.getEndIndex());
		
		// 검색조건과 일치하는 데이터 조회하기
		List<Employee> employees = employeeDao.getEmployees(searchForm);
		
		Result<Employee> result = new Result<Employee>();
		result.setData(employees);
		result.setRows(rows);
		result.setMessage("데이터 조회 완료");
		result.setCode(1);
		
		return result;
		
		/*
		 	사원조회 API
		 		요청 URL
		 			erp/search.json
		 		요청 파라미터
		 			pageNo
		 				요청할 페이지 번호
		 			opt, keyword
		 				opt : 검색조건 (dept, job, name, salary)
		 				keyword : 검색어
		 			display
		 				한번에 조회할 데이터 갯수
		 			sort, orderby
		 				sort : 정렬기준 (employee_id, firstname, salary)
		 				orderby : 정렬방법 (asc,desc)
		 		
		 		응답
		 			data
		 				사원리스트
		 			rows
		 				전체 조회건수
		 			message
		 				처리결과 메세지
		 			code
		 				처리결과 코드
		 */
	}
	/*
	@RequestMapping("/search.json")
	public ModelAndView search(SearchForm searchForm){
		// 검색 조건과 일치하는 데이터 갯수 조회하기
		int rows = employeeDao.getRowCount(searchForm);
		Pagination pagination = null;
		
		// 현재 페이지번호, 조회된 데이터 갯수로 Pagination 객체 생성하기
		if (searchForm.getDisplay() != 0) {
			pagination = new Pagination(searchForm.getDisplay(), searchForm.getPageNo(), rows);
		} else {
			pagination = new Pagination(searchForm.getPageNo(), rows);
		}
			
		// 현재 페이지번호에 해당하는 조회시작번호와 조회끝번호를 SearchForm 에 저장하기 
		searchForm.setBeginIndex(pagination.getBeginIndex());
		searchForm.setEndIndex(pagination.getEndIndex());
		
		// 검색조건과 일치하는 데이터 조회하기
		List<Employee> employees = employeeDao.getEmployees(searchForm);
		ModelAndView mav = new ModelAndView();
		mav.addObject("data", employees);
		mav.setView(jsonView);
		
		return mav;
		
	}*/
	/*
	@RequestMapping("/search.json")
	public @ResponseBody List<Employee> search(SearchForm searchForm){
		// 검색 조건과 일치하는 데이터 갯수 조회하기
		int rows = employeeDao.getRowCount(searchForm);
		Pagination pagination = null;
		
		// 현재 페이지번호, 조회된 데이터 갯수로 Pagination 객체 생성하기
		if (searchForm.getDisplay() != 0) {
			pagination = new Pagination(searchForm.getDisplay(), searchForm.getPageNo(), rows);
		} else {
			pagination = new Pagination(searchForm.getPageNo(), rows);
		}
			
		// 현재 페이지번호에 해당하는 조회시작번호와 조회끝번호를 SearchForm 에 저장하기 
		searchForm.setBeginIndex(pagination.getBeginIndex());
		searchForm.setEndIndex(pagination.getEndIndex());
		
		// 검색조건과 일치하는 데이터 조회하기
		List<Employee> employees = employeeDao.getEmployees(searchForm);
		
		// Model  -- 데이터
		// ModelAndView -- 데이터 + 뷰이름 : ViewResolver가 이후에 실행된다. / InterResourceViewResolver가 실행.
		// ModelAndView -- 데이터 + 뷰객체 : ViewResolver가 실행될 필요없다. / 설정한 뷰에 의해서 데이터가 특정타입의 컨텐츠로 변환된다.
		
		
		return employees;
	}*/
	
	@RequestMapping("/search.do")
	public String search(SearchForm searchForm, Model model) {
		/*
		int beginIndex = (searchForm.getPageNo() - 1) * 10 + 1;
		int endIndex = searchForm.getPageNo() * 10;	
		searchForm.setBeginIndex(beginIndex);
		searchForm.setEndIndex(endIndex);
		*/
		
		// 검색 조건과 일치하는 데이터 갯수 조회하기
		int rows = employeeDao.getRowCount(searchForm);
		Pagination pagination = null;
		
		// 현재 페이지번호, 조회된 데이터 갯수로 Pagination 객체 생성하기
		if (searchForm.getDisplay() != 0) {
			pagination = new Pagination(searchForm.getDisplay(), searchForm.getPageNo(), rows);
		} else {
			pagination = new Pagination(searchForm.getPageNo(), rows);
		}
			
		// 현재 페이지번호에 해당하는 조회시작번호와 조회끝번호를 SearchForm 에 저장하기 
		searchForm.setBeginIndex(pagination.getBeginIndex());
		searchForm.setEndIndex(pagination.getEndIndex());
		
		// 검색조건과 일치하는 데이터 조회하기
		List<Employee> employees = employeeDao.getEmployees(searchForm);
		
		// jsp 에 조회된 데이터 전달하기
		model.addAttribute("employees", employees);
		// jsp 에 페이지내비게이션 정보 전달하기
		model.addAttribute("pagination", pagination);
		// jsp 에 검색 정보 전달하기
		model.addAttribute("search", searchForm);
		
		return "search";
	}
}
