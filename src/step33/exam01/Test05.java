//주제 id와 name의 내부적인 동작원리
package step33.exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {

  public static void main(String[] args) {
    //1) 객체 준비하기
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam01/Application-context04.xml");
    //생성된 빈의 개수 알아내기
    
    System.out.printf("빈의 개수: %d\n", context.getBeanDefinitionCount());
    System.out.println("-----------------------------------");
    // 빈의 이름(id 속성에 지정한 이름)을 알아내기
    // =>id속성이 없는 빈은 name 속성에 지정된 첫 번째 이름을 사용한다.
    // =>id속성이 있다면 그 값을 빈의 공식적인 이름으로 사용한다.
    // =>id속성이 없다면 name 속성의 첫 번째 이름을 공식적인 이름으로 사용한다.
    // =>나머지 이름은 별명으로 간주한다.
    System.out.print("빈의 이름들 : ");
    String[] names = context.getBeanDefinitionNames();
    String[] aliases;
    for (String name : names) {
      System.out.print(name + ",");
      //빈의 다른이름을 알아내기
      System.out.print("빈의 별명들 : ");
      aliases = context.getAliases(name); // Aliases는 bean의 나머지 이름을 아라낸다
      for (String aslias : aliases) {
        System.out.print(aslias + ",");
      }
      System.out.println();
    }
    System.out.println("-----------------------------------");   
  }
}
//빈 컨테이너에서 객체를 꺼낼 때 id가 되었든, name이 되었든
//구분없이 이름을 지정하면 된다.




