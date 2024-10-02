package test;

// 스프링 관련 클래스를 사용하기 위해 import
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      
      // 스프링 컨테이너를 구동시키는 코드
      // applicationContext.xml에 설정된 빈(bean) 정보를 읽어들이는 컨테이너 생성
      AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

      // args[0]에 입력된 값으로 해당 이름의 Phone 객체(bean)를 컨테이너에서 가져옴
      // 컨테이너에 등록된 객체를 가져오는 메소드 getBean() 사용
      Phone phone = (Phone)factory.getBean(args[0]);
      
      // args[1]에 입력된 값으로 해당 이름의 Watch 객체(bean)를 컨테이너에서 가져옴
      Watch watch = (Watch)factory.getBean(args[1]);

      // Bean == 자바 객체 == POJO (Plain Old Java Object)
      // 스프링에서 관리되는 객체를 빈이라고 부르며, 이 객체를 요청하는 것을 lookup이라고 함
      
      // Phone 객체의 powerOn() 메소드를 호출하여 폰의 전원을 켬
      phone.powerOn();
      
      // Watch 객체의 soundUp() 메소드를 호출하여 소리를 올림
      watch.soundUp();
      
      // Watch 객체의 soundDown() 메소드를 호출하여 소리를 내림
      watch.soundDown();
      
      // Phone 객체의 powerOff() 메소드를 호출하여 폰의 전원을 끔
      phone.powerOff();
      
      // 스프링 컨테이너를 종료하여 자원을 반환하고, 관리하던 빈을 소멸시킴
      factory.close();
      
   }
}
