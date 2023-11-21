package polymorphism;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	
	public LgTV() {
		System.out.println("====> LgTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV ---- 전원 켜다");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV ---- 전원 끄다");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV ---- 소리 올리다");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV ---- 소리 내리다");
	}
}
