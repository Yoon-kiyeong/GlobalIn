package polymorphism;

public class AppleSpeaker {
	public AppleSpeaker() {
		System.out.println("=====> SonySpeaker 객체 생성...");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker ... 소리 올린다");
	}

	public void volumeDown() {
		System.out.println("SoneSpeaker ... 소리 내린다");
	}
}
