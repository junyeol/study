package test;

public class Iphone {
	private int num;
	public Iphone() {
		//this.num=1234;
		System.out.println("아이폰 객체 생성");
	}
	public void init() {
		num = 1234;
	}
	public void powerOn() {
		System.out.println("아이폰 전원 ON");
	}
	public void powerOff() {
		System.out.println("아이폰 전원 OFF");
	}
}
