//주제 primitive type과 String이 아닌 프로퍼티의 값을 설정하는 방법
package step33.exam08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam08/Application-context03.xml");
    System.out.println(context.getBean("c1"));
  }
}
