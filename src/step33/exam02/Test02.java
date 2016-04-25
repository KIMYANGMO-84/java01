//주제 생성자 호출하기
package step33.exam02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam02/Application-context02.xml");
    
    System.out.println((Car)context.getBean("c1"));
    System.out.println((Car)context.getBean("c2"));
    System.out.println((Car)context.getBean("c3"));    
    System.out.println((Car)context.getBean("c5"));
    System.out.println((Car)context.getBean("c6"));
  }
}
