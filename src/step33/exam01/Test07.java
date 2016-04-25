//주제 빈의 이름을 지정하지 않았을때
package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test07 {

  public static void main(String[] args) {
    //1) 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam01/Application-context07.xml");
    //생성된 빈의 개수 알아내기
    
    System.out.printf("빈의 개수: %d\n", context.getBeanDefinitionCount());
    System.out.println("-----------------------------------");    
    String[] names = context.getBeanDefinitionNames();
    String[] aliases;
    for (String name : names) {
      System.out.print("빈의 이름들 : ");
      System.out.print(name + ",");      
      System.out.print("빈의 별명들 : ");
      aliases = context.getAliases(name); 
      for (String aslias : aliases) {
        System.out.print(aslias + ",");
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");
    
    Car obj1 = (Car) context.getBean("step33.exam01.Car#0");
    Car obj2 = (Car) context.getBean("step33.exam01.Car");
    System.out.println(obj1);
    System.out.println(obj2);
  }
}