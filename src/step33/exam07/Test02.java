//주제 Map 의존 객체 주입
package step33.exam07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam07/Application-context02.xml");
    System.out.println(context.getBean("c1"));
    
  }
}
