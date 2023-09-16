package Study;

public class Main extends Player {
	public static void main(String[] args) {
		Main main = new Main();
		main.play("Stevie Ray Vaughan - Lenny");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		System.out.println(songName + " 해당 곡을 재생합니다");
		
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지 합니다");
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다");
	}
}
