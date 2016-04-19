/* 주제 : 인스턴스 변수에 접근*/

package step12;

public class Exam03 {
  static int staticValue = 10;
  int instanceValue;
  public void instanceMethod() {
    this.instanceValue = 2000;
  }
  static {
    // instanceValue = 3000; // error 인스턴스 주소가 있어야만 접근 가능
    // static 블록은 인스턴스를 생성하기도 전에 실행되기 때문에
    // 인스턴스 주소가 있을 턱이 없다.
    // => this 변수가 존재하지도 않는다.
    // this.instanceValue = 3000; // error
  }
    // 스태틱 메서드는 인스턴스 주소 없이 호출할 수 있다.
    // 만약 인스턴스 주소 없이 호출하면 어떡할텐데?
  static void staticMethod() {
    // 그래서 스태틱 메서드는 this라는 변수가 없다.
    // this.instanceValue(); // 오류
  }


  //인스턴스 변수는 사용되기 전에 생성자를 통해 초기화시킬 수 있다.
  public Exam03() {

  }

  public static void main(String[] args) {
   // instanceValue = 4000; // error 인스턴스 주소가 있어야만 접근 가능
  }
}

/* 인스턴스 변수 및 메서드에 접근
- 인스턴스 주소가 있어야만 가능하다.
*/
