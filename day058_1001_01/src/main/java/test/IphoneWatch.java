package test;

public class IphoneWatch implements Watch{
	public IphoneWatch() {
		System.out.println("아이폰워치 객체 생성");

	}

	@Override
	public void soundUp() {
		System.out.println("아이폰워치 소리 키움");
		
	}

	@Override
	public void soundDown() {
		System.out.println("아이폰워치 소리 줄임");
		
	}


}
