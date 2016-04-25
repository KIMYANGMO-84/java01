//주제 생성자 호출하기
package step33.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam03/Application-context.xml");
    Car c1 = (Car)context.getBean("c1");   
    Car c2 = (Car)context.getBean("c2");
    
    System.out.println(c1);
    System.out.println(c2);
    
  }
}
