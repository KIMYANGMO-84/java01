//주제 : Reflection API - 특정 메서드만 알아내기
package step25;

import java.lang.reflect.Method;

public class Test07 {
  static class Member {
    public static int count;
        
    String name;
    
    public Member() {
      System.out.println("Member()....");
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public void setName(String firstName, String middleName, String lastName) {
      this.name = firstName + " " + middleName  + " " +  lastName;
    }
    
    
    protected void m1() {
      
    }
    void m2() {
      
    }
    private void m3() {
      
    }
    
    
  }  
  public static void main(String[] args) throws Exception {    
    Class<?> clazz = Class.forName("step25.Test07$Member");   
    //String 클래스 정보를 얻는 방법
    // 1) " ".getClass()
    // 2) String.class
    // 3) Class.forName("java.lang.String")
    Method m1 = clazz.getDeclaredMethod("setName", String.class);
    Method m2 = clazz.getDeclaredMethod("setName", String.class, String.class, String.class);
    //다음과 같이 존재하지 않는 메서드를 찾으려고 한다면 예외가 발생한다.
    Method m3 = clazz.getDeclaredMethod("setName", int.class);
    
  }
}
