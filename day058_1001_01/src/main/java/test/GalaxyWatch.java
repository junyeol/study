package test;

public class GalaxyWatch implements Watch{
	public GalaxyWatch() {
		System.out.println("갤럭시워치 객체 생성");

	}
	@Override
	public void soundUp() {
		System.out.println("갤럭시워치 소리 키움");
		
	}

	@Override
	public void soundDown() {
		System.out.println("갤럭시워치 소리 줄임");
		
	}

}
