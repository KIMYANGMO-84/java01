// 주제 : 상속 관계에서 인스턴스 변수 초기화 순서와 생성자 호출 순서
package step14.exam08;

public class Test {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.v1);
    System.out.println(a.v2);
    System.out.println(a.v3);
    B b = new B();
    System.out.println(b.v1);
    System.out.println(b.v2);
    System.out.println(b.v3);
    System.out.println(b.v4);
    System.out.println(b.v5);
  }
}
/* 상속관게에서 생성자 호출
- 모든 생성자는 첫번째 줄에 슈퍼 클래스의 기본생성자를
  호출하는 문장을 포함하고 있다. 예) super();
- 만약 개발자가 해당 코드를 넣지 않는다면 컴파일러가 자동으로 삽입한다.
  => 그래서 하위 클래스의 생성자를 호출할 때 상위 클래스의 생성자가 자동으로
     호출되는 것이다.
*/
