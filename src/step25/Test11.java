//주제 : Reflection API - 메서드를 호출할 때 여러 개의 값 넘기기
package step25;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.LocalVariable;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.Type;

public class Test11 {
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
    JavaClass clazz2 = Repository.lookupClass("step25.Test11$Member");
    Method[] methods = clazz2.getMethods();
    LocalVariable[] vars = null;
    Type[] types = null;
    for (Method m : methods) {
      if (!m.getName().equals("setMember")) {
        continue;
      }
      
      types = m.getArgumentTypes(); //this변수를 고려하지 않는다.
      vars = m.getLocalVariableTable().getLocalVariableTable();
      
      for (int i = 1; i < vars.length; i++) {
        System.out.printf("%s:%s\n", vars[i].getName(), types[i - 1].toString());
      }      
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
