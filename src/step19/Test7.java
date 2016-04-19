package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test7 { // Exception 예외 다루기 - throws사용
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("test.txt"); //<- RuntimeException계열

      FileReader in = new FileReader("test.txt"); //<- Exception계열
      System.out.println("----------------------------------------");
      System.out.println("\t해당 파일을 찾았습니다.");
      System.out.println("----------------------------------------");

      System.out.println("----------------------------------------");
      System.out.println("\t파일을 찾을 수 없습니다.");
      System.out.println("----------------------------------------");

  }
}
/*
# throws 명령
  - 상위 호출자에게 오류 상황을 알리는 문법.
  - 만약 상위 호출자가 JVM이라면, 즉시 실행을 멈춘다.
  - 주의!
    => 사용을 자제하라.
    => 상위 호출자가 JVM일 경우 즉시 실행을 멈추기 때문이다.
    => 예외 처리를 하지 않은 결과가 발생한다.
      => 예외 처리의 목적 상실
*/
