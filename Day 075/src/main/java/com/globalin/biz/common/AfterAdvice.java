package com.globalin.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	
//	@Pointcut("execution(* com.globalin.biz..*Impl.*(..))")
//	public void allPointCut() {}
	
	@After("PointCutCommon.allPointcut()")
	public void finallyLog() {
		System.out.println("[사후처리] 비즈니스 수행 후 무조건 동작");
	}
}
