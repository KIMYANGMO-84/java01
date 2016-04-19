package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test15 { // Exception의 이해 1.

  static void m1(int i) throws AgeException {
    throw new AgeException();
  }
// throws 절에 상위 클래스를 지정할 수 있다.
  static void m2(int i) throws ChildException {
    throw new ChildException();
  }

  static void m3(int i) throws OldManException {
    // Exception을 던질 때는 반드시 메서드 선언부에 명시해야 한다.
    throw new OldManException();
  }


  public static void main(String[] args) {
    try {
      m3(10); //throw OldManException
      m2(10); //throw ChildException
      m1(10); //throw AgeException
    } catch (OldManException e) {
      e.printStackTrace();
    } catch (ChildException e) {
      e.printStackTrace();
    } catch (AgeException e) {
      e.printStackTrace();
    }
  }
}
/*
# catch 작성 순서
-
*/
