//주제 스프링 IoC 컨테이너 사용 후
package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {

  public static void main(String[] args) {
    //1) 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam01/Application-context04.xml");
    //2) 객체 꺼내기
    Car r1 = (Car)context.getBean("c1");
    Car r2 = (Car)context.getBean("c2");
    Car r3 = (Car)context.getBean("c3");
    Car r4 = (Car)context.getBean("c4");
    Car r5 = (Car)context.getBean("c5");
    Car r6 = (Car)context.getBean("c6");
    Car r7 = (Car)context.getBean("c7");
    
    
    
    System.out.println("r1: " + r1);
    System.out.println("r2: " + r2);
    System.out.println("r3: " + r3);
    System.out.println("r4: " + r4);
    System.out.println("r5: " + r5);
    System.out.println("r6: " + r6);
    System.out.println("r7: " + r7);
  }

}
