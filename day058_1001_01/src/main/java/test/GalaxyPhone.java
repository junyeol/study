package test;

public class GalaxyPhone implements Phone {
	public GalaxyPhone() {
		System.out.println("갤럭시 객체 생성");

	}

	@Override
	public void powerOn() {
		System.out.println("갤럭시 On");
		
	}

	@Override
	public void powerOff() {
		System.out.println("갤럭시 OFF");
		
	}

}
