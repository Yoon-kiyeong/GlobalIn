package com.globalin.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AFterThrowingAdvice {

//	@Pointcut("execution(* com.globalin.biz..*Impl.*(..))")
//	public void allPointcut() {}
	
	@AfterThrowing(pointcut = "PointCutCommon.allPointcut()", throwing = "exceptObj")
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		
		String method = jp.getSignature().getName();
		
		/*
		  System.out.println("[예외처리] "+method+"()메소드 수행중 방생된 예외 메세지 : "+exeptObj.
		  getMessage());
		 */
		
		System.out.println(method+"()메소드 수행 중 에외 발생 ....");
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적절한 값이 입력되었습니다.");
		}else if(exceptObj instanceof NumberFormatException) {
			System.out.println("숫자형식의 값이 아닙니다.");
		}else if(exceptObj instanceof Exception) {
			System.out.println("문제가 발생하였습니다.");
		}
	}
}
