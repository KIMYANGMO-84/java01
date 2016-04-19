/* 주제 : 메서드 정의하기*/
package step06;

public class Exam04 {

  // 값을받아서 값을 리턴하는 메서드 정의
  // 인사말을 출력하는 명령어를 묶었다.
  static String hello(String localeCode) {
    switch (localeCode) {
      case "ko_KR" :
       return "안녕하세요.";

      case "ja_JP" :
       return "こんにちわ.";

      case "zh_CN" :
       return "你好.";

      default :
       return "Hello.";
    }
  }
  public static void main(String[] args) {
    // 값을받아서 값을 리턴하는 메서드 실행
    // => 메서드가 주는 것 받고 싶다면 그 데이터를 담을 변수를 준비하라.
    String str = hello("ko_KR");
    System.out.println(str);
    str = hello("ja_JP");
    System.out.println(str);
    str = hello("en_US");
    System.out.println(str);

    // 명령어를 메서드로 묶어두면 여러 번 실행할 수 있다.
  }
}
/* 메서드 시그너처(method signature)?
=> c / c++ 펑션 프로토타입
=> 메서드 이름, 파라미터, 리턴 타입 정보를 말한다.
예) String hello(String localeCode)

인자 값(argument)?
=> 메소드를 실행할 때 전달하는 값.
예) String str = hello("ko_KR");
    "ko_KR"이 아큐먼트.
파라미터(parameter)?
=> 인자 값을 받기 위해 선언한 변수
static String hello(String localeCode) {...}
예) localeCode 변수가 파라미터이다.

*/

/*메서드?
1) 코드 관리 관점 => 특정 기능을 수행하는 명령어들의 묶음
                     명령어들을 좀 더 조직적으로 관리할 수 있다.
                     한 번 작성한 명령어들을 재 사용하기가 쉽다.
2) 사용자 데이터 타입을 정의하는 관점 =>
                     개발자가 새로 정의한 데이터를 다루기 위해 만든 연산자.
3) 물건 중심(Object-Oriented)의 관점 =>
                     물건에게 명령을 내리는 도구이다.
                     OOA/OOD(객체지향 분석, 설계)에서는
                     메시지(message)라 부르기도 한다.
메서드 정의 분법?
static [리턴타입] 메서드이름(파라미터 선언, .....) {
  명령어...;
  명령어...;
  return [리턴값];
}
=> 리턴 타입 : 메서드가 리턴하는 값의 종류
   - 리턴할 값이 없다면 void로 선언한다.
=> 파라미터 선언 : 메서드를 실행할 때 외부에서 주는 값을 받는 변수
   - 외부에서 값을 받을 일이 없다면 변수를 선언하지 않는다.
=> return : 메서드 실행을 끝낸 후 그 결과를 반환하는 명령어.

메서드 실행 ?
=> 리번값을 받을 변수 = 리턴
*/
