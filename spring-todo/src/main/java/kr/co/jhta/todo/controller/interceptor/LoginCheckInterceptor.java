package kr.co.jhta.todo.controller.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.co.jhta.todo.vo.User;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{
	
	List<String> paths;
	public void setPaths(List<String> paths) {
		this.paths = paths;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		
		// request.getRequestURI() > /todo/complete.do
		// request.getContextPath() > /todo
		String url = request.getRequestURI().replaceFirst(request.getContextPath(), "");
		
		if (paths.contains(url)) {
			
			HttpSession session = request.getSession(true);
			User user = (User) session.getAttribute("LOGINUSER");
			if (user != null) {
				return true;
			}else {
				response.sendRedirect("login.do?error=deny");
				return false;
			}
		}else {
			return true;
		}
	}
}
