//주제 @Autowired Annotation을 이용한 의존객체 주입
package step33.exam09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

  public static void main(String[] args) {    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam09/Application-context02.xml");

    System.out.println("--------------------------");
    
    printAllObjects(context);    
    
    System.out.println("--------------------------");    
    
    System.out.println(context.getBean("car1"));
    System.out.println(context.getBean("engine1"));    
    
  }
  
  private static void printAllObjects(ApplicationContext ctx) {
    String[] names = ctx.getBeanDefinitionNames();
    for (String name : names) {
      System.out.printf("%s : %s\n", name, ctx.getBean(name).getClass().getName());
    }
  }
}
