package com.globalin.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

public class AroundAdvice {

//	@Pointcut("execution(* com.globalin.biz..*Impl.*(..))")
//	public void allPointCut() {}
	
	@Around("PointCutCommon.allPointCut")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
	
		String method = pjp.getSignature().getName();
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		//System.out.println("[BEFORE] : 비즈니스 메소드 수행 전에 처리 할 내용 ...");
		Object obj = pjp.proceed();
		stopWatch.stop();
		
		//System.out.println("[AFTER] : 비즈니스 메소드 수행 후에 처리 할 내용 ...");
		
		System.out.println(method+"() 메소드 수행에 걸린 시간 : "+stopWatch.getTotalTimeMillis()+"(ms)초");
		return obj;
		
	}
}
