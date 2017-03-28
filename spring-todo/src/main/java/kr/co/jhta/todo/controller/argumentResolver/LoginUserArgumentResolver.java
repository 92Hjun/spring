package kr.co.jhta.todo.controller.argumentResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import kr.co.jhta.todo.vo.User;

public class LoginUserArgumentResolver implements HandlerMethodArgumentResolver{
	
	// supportParameter()의 반환값이 true인 경우 이 argumentResolver를 적용가능한 타입이다.
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		
		return User.class.isAssignableFrom(parameter.getParameterType());
	}
	
	// NativeWebRequest는 요청객체를 담아놓은 표준객체다.
	// 핸들러 메소드의 매개변수가 argumentResolver를 적용가능할 수 있는 타입인 경우
	// resolverArgument()메소드를 실행해서 반환되는 객체를
	// 해당 매개변수에 주입해준다.
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
								  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		HttpServletRequest req = (HttpServletRequest) webRequest.getNativeRequest();
		
		HttpSession session = req.getSession(true);
		
		
		User user = (User)session.getAttribute("LOGINUSER");
		if (user == null){
			user = new User();
		}
				
		return user;
	}
}
