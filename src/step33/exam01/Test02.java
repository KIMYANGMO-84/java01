//주제 스프링 IoC 컨테이너 사용 후
package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {
    //1) 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam01/Application-context.xml");
    //2) 객체 꺼내기
    Car r1 = (Car)context.getBean("c1");
    Car r2 = (Car)context.getBean("c1");
    
    if (r1 == r2) {
      System.out.println("기본적으로 인스턴스는 한 개만 생성한다.");
    }
    
    System.out.println(r1);
  }

}
