//주제 : Reflection API - 메서드를 호출할 때 여러 개의 값 넘기기
package step25;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test10 {
  static class Member {         
    String name;
    int age;
    float weight;
    float height;
    
    public void setMember(String name, int age, float weight, float height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
      
    }
       
    
  @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + 
          ", weight=" + weight + ", height=" + height + "]";
    }
  

  public static void main(String[] args) throws Exception {    
    Class<?> clazz = Class.forName("step25.Test10$Member");   
    //1) 인스턴스 생성
    Object obj = clazz.newInstance();
    //2) setMember() 메서드 찾기
    Method m = clazz.getDeclaredMethod("setMember", String.class,
        int.class, float.class, float.class);
    //3) 파라미터가 여러 개인 메서드 호출하기
    //=>아규먼트를 배열에 담아서 넘기기
    Object[] arguments = {"홍길동", 20, 85.5f, 182.4f};
    m.invoke(obj, arguments);
    System.out.println(obj);
    
    //아규먼트를 순차적으로 나열하기
    m.invoke(obj, "임꺽정", 30, 98.2f, 192.4f);
    System.out.println(obj);
    Parameter[] params = m.getParameters();
    for (Parameter param : params) {
      System.out.printf("%s:%s\n", param.getName(), param.getType().getName());
    }
  }
} 
}
/* #메서드의 파라미터 이름
 * -.class 파일의 로컬변수 테이블에는 각 메서드의 파라미터 이름이 기록되어 있다.
 *  => 하지만, 리플랙션 API를 사용하여 그 로컬 변수 테이블의 정보를 추출할 수 없다.
 * - 해결책?
 * 컴파일 옵션을 사용하여 메서드의 파라미터 이름을 .class파일에 저장하게 해야한다.
 * 그래야만 리플랙션 API를 사용하여 메서드의 파라미터 이름을 알아낼 수 있다.
 * 예) javac -parameters 소스
 */
