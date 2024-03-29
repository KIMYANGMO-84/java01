//주제 생성자 호출하기
package step33.exam04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam04/Application-context03.xml");
    
    Engine e = (Engine)context.getBean("e1");
    Car c1 = (Car)context.getBean("c1");
    Car c2 = (Car)context.getBean("c2");
    
    // c1과 c2에 주입된 Engine은 같은 객체이다.
    // => 빈 컨테이너는 기본적으로 객체를 1개만 생성하여 공유한다.
    
    if (e == c1.engine) {
      System.out.println("e == c1.engine");
      System.out.println(context.getBean("c1"));   
    }
    
    if (e == c2.engine) {
      System.out.println("e == c2.engine");
      System.out.println(context.getBean("c2"));
    }
    System.out.println(context.getBean("c3"));   
    System.out.println(context.getBean("c4"));
    
  }
}
