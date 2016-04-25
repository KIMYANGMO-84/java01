//주제 생성자 호출하기
package step33.exam03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam03/Application-context02.xml");
    System.out.println(context.getBean("c1"));    
    System.out.println(context.getBean("c2"));
    
    
    
  }
}
