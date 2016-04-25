//주제 객체 생성 정책(scope) 
package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {

  public static void main(String[] args) {
    // 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam01/Application-context10.xml");
    //2) scope 속성이 prototype 일때,
    // => getBean()을 호출하기 전까지는 객체를 생성하지 않는다.
    // =>getBean()이 호출할 때 마다 새 객체가 생성하여 리턴한다.
    Car p1 = (Car) context.getBean("c3");
    Car p2 = (Car) context.getBean("c3");
    Car p3 = (Car) context.getBean("c3");
    
    //매번 새 객체를 리턴하기 때문에 p1,p2,p3는 서로 다른 객체이다
    if (p1 == p2) {
      System.out.println("p1 == p2");
    } else if (p2 == p3) {
      System.out.println("p2 == p3");
    } else {
      System.out.println("매번 새 객체를 리턴하기 때문에 p1,p2,p3는 서로 다른 객체이다");
    }
  }
}