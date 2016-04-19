package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test11 { // RuntimeException의 이해 1.활용법
  static void m1(int i) {
    if (i < 17) {
      throw new RuntimeException("17세 미만 입니다.");
    }
    m2(i);
  }

  static void m2(int i) {
    if (i > 70) {
      throw new RuntimeException("70세 초과 입니다.");
    }
    m3(i);
  }

  static void m3(int i) {
    throw new RuntimeException("예외입니다.");
  }
  public static void main(String[] args) {
    try {
      m1(75);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
/*
# RuntimeException의 의미
1) 적절한 지점에서 예외를 처리하도록 권고한다.
  => 예외처리에 대해 느슨한요구!
  => 개발자의 부담을 덜어준다.
2) 중앙집중적으로 예외처리를 할 수 있다.
  => m1(), m2(), m3()에서 발생한 예외를 main()
  에서 모두 처리한다.


*/
