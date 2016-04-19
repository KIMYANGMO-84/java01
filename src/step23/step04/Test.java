// 이미 다른 클래스를 상속 받는 경우 해결책!
// => 기존에 상속 받는 클래스 대신 AbstractHello를 상속 받게 한다.
//  인터페이스를 이용한 호출 규칙 정하기
/*  => AbstractHello처럼 서브 클래스에게 상속해 줄 것도 없는 경우,
  단지 호출 규칙만 정의할 필요가 있는 경우,
  -->인터페이스 문법을 사용

  #인터페이스
  => 사용객체와 피사용객체 사이의 호출 규칙을 정의할 때 사용하는 문법이다.
  => 클래스의 구현 규칙을 정의함으로써, 잘못된 구현을 방지할 수 있다.
  => 일관된 프로그래밍이 가능하다.
  => 인터페이스를 구현한 어떤 클래스든 간에 그 자리를 대체할 수 있다.
   --> 코드 대체가 쉽다.
  => 반드시 추상 메서드만 선언해야 한다.
  => 규칙이기 때문에 모든 멤버는 공개(public)되어야 한다.
    모든 메서드는 public abstract이다.
  => 직접 인스턴스를 생성하는 것이 아니기 때문에,
    모든 필드는 public static final이다.
  # 추상 클래스
   => 추상 클래스는 서브 클래스의 고통 필드나 메서드를 상속해주기 위한 용도이다.
   => 추상 클래스에서 추상 메서드의 의미는, 서브 클래스에게 메서드의 구현을 강제하는 문법일 뿐이다.
*/
package step23.step04;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");
    System.out.println(lang);
    String message = null;
    AbstractHello obj = null; // 레퍼런스 변수를 이용하여
    // 인사말을 리턴할 객체의 타입을 한정한다.
    if ("en".equals(lang)) {
      obj = new HelloEn();
    } /* else if ("jp".equals(lang)) {
      obj = new HelloJp(); // AbstractHello의 서브 클래스가 아니면 컴파일 오류!
      // AbstractHello의 규칙을 따르지 않은 클래스를 사용하려 한다면
      // 컴파일 오류가 발생한다!
      // => 이런 방식(슈퍼 클래스를 통한)으로 호출 규칙을 제어할 수 있다.
    } */else {
      obj = new Hello();
    }
    // 어떤 객체인진 모르겠지만, 그 객체는 AbstractHello의 서브 클래스이기 때문에
    // 반드시 greet()라는 메서드가 있을 것이다.
    // => 바로 이것이 상속을 이용한 호출규칙을 제한하는 방법이다.
    message = obj.greet();
    System.out.println(message);
  }
}
