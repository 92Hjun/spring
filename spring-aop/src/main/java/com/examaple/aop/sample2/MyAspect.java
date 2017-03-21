package com.examaple.aop.sample2;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.example.vo.Role;

@Aspect
public class MyAspect {
	
	@Around("within(com.example.service.AdminService+) && args(.., role)")
	public Object serurity(ProceedingJoinPoint jp, Role role) throws Throwable{
		
		System.out.println("[security around advice] role : " + role.getUserName() + ", " + role.getType());
		
		if("ADMIN".equals(role.getType())){
			Object returnValue = jp.proceed();
			return returnValue;			
		}else {
			throw new RuntimeException("권한부족...");
		}
		
	}
	
	
	
	// 리턴값이 반드시 오브젝트 여야된다. ProceedingJoinPoint를 매개변수로 반드시 가지고 있어야한다. 
	@Around("within(com.example.service.Operator+)")
	public Object profiling(ProceedingJoinPoint jp)throws Throwable{
		
		try{
			// 대상메소드를 실행하는 코드보다 앞에적으면 전처리 코드이다.(BeforeAdvice)
			Object[] args = jp.getArgs();
			System.out.println("[around advice 전처리]매개변수값 " + Arrays.toString(args));
			
			// Around 에서 대상메소드를 실행하는 코드
			// 대상메소드와 실행결과값을 returnValue에 저장한다.
			Object returnValue = jp.proceed();

		// 대상메소드를 실행하는 코드보다 뒤에적으면 후처리 코드이다. (AfterReturning Advice)
			System.out.println("[around advice 후처리]결과값: " + returnValue.toString());
			// 대상메소드의 실행결과값을 반환한다.
			return returnValue;
			
		}catch (Throwable t) {
			
			// 예외처리 코드 AfterThrowing Advice
			System.out.println("[around advice 에러처리] 에러메세지 :" + t.getMessage());
			System.out.println("[around advice 에러처리] 요청클래스 :" + t.getClass().getSimpleName());
			throw t;
		}finally {
			// 정상종료 After Advice
			System.out.println("[around advice] around 공통기능 수행 종료");
		}
	}
}
