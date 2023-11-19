package polymorphism;

/*
 * 결합도
 * - 하나의 클래스가 다른 클래스와 얼마나 많이 연결되어 있는지를 나타냄
 * 
 * 
 */

public class SamsungTV implements TV {
	private SonySpeaker speaker;
	int price;
	public SamsungTV() {
		System.out.println("SamsungTV(1) 객체 생성...");
	}

	public void destoryMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV(2) 객체 생성...");
		this.speaker = speaker;
//		System.out.println("SamnsungTV 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
	}
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV ---- 전원 켜다");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV ---- 전원 끄다");
	}

	@Override
	public void volumeUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

	public void initMethod() {
		System.out.println("객체 초기화 작업처리");
	}
	
}
