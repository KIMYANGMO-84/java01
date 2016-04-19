package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test9 { // 예외 던지고 받기 - Exception
  public static void main(String[] args) /*throws Exception*/ {
    MyClass obj = new MyClass();
    // Exception 예외는 반드시 처리해야 한다.
    // => try~catch 로 처리하든
    // => 메서드 선언부에 어떤 예외가 발생하는지  명시하든
    //  예) void main(String[] args) throws Exception {...}
    //obj.m2();

    // 2) try~catch로 예외 처리를 할 수도 있다.
    try {
      obj.m2();
    } catch (Exception e) {
      System.out.println("-----------------------------------");
      System.out.println("\tm2() 에서 예외 발생");
      System.out.println("-----------------------------------");
    }
  }
}
/*

*/
