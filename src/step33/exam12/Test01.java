//주제 Mybatis와 Spring 연동
package step33.exam12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam12/Application-context.xml");

    System.out.println("--------------------------");
    
    printAllObjects(context);    
    
    System.out.println("--------------------------");    
    
    System.out.println(context.getBean("memberDao"));
//    System.out.println(context.getBean("engine"));    
    
  }
  
  private static void printAllObjects(ApplicationContext ctx) {
    String[] names = ctx.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s : %s\n", name, ctx.getBean(name).getClass().getName());
    }
  }
}
