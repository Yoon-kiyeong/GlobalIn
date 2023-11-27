package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser implements TV{
	public static void main(String[] args) {
		
		/*
		 * 1. Spring 컨테이너를 구동함
		 * pojo방식 (옛날 자바 방식으로 생성)
		 * 
		 */
		
//		BeanFactory factory = new BeanFactory();
		AbstractApplicationContext factory = new GenericXmlApplicationContext("ApplicationContext.xml");
		
		/*
		 * ApplicationContext 두 가지 유형의 컨테이너
		 * 1. GenericXmlApplicationContext
		 * - 파일 시스템이나 클래스의 경로에 있는 xml 설정파일을 로딩하여 구동하는 컨테이너
		 * 2. xmlWebApplicationContext
		 * - 웹 기반의 스프링 어플리케이션을 개발할 때 사용하는 컨테이너
		 * 
		 */
		
//		SamsungTV tv = new SamsungTV();
//		TV tv = new SamsungTV();
//		TV tv = (TV)factory.getBean("samsung");

//		* 2. Spring 컨테이너로부터 필요한 객체를 요청(Look Up)함
		TV tv = new SamsungTV();
//		TV tv1 = (TV)factory.getBean("tv");
//		TV tv2 = (TV)factory.getBean("tv");
//		TV tv3 = (TV)factory.getBean("tv");
//		
		
//		TV tv1 = new SamsungTV();
//		TV tv2 = tv1;
//		TV tv3 = tv2;
//		TV lgtv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// spring 컨테이너 종료
		factory.close();
		
//		LgTV lgtv = new LgTV();
//		lgtv.powerOn();
//		lgtv.volumeUp();
//		lgtv.volumeDown();
//		lgtv.powerOff();
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		
	}
}
