//오버라이딩(overriding)
package step14.exam05;

public class Test {
  public static void main(String[] args) {
    Sedan c = new Sedan();
    // 슈퍼 클래스의 설계도를 보고 만든 메모리
    c.model = "java";
    c.maker = "Oracle";
    c.cc = 198172049;
    c.capacity = 23;

    // 자신의 설계도를 보고 만든 메모리
    c.isAutomatic = true;
    c.isSunroof = false;

    // 슈퍼 클래스의 printInfo() 실행
    // => 서브 클래스(Sedan)에 추가한 속성 값을 출력하지 못한다.
    // => 해결책?
    //    서버로부터 상속받은 메서드를 재정의 한다.
    c.printInfo();
  }
}
/* 상속의 의미?
- 설계도의 연결을 의미한다.

인스턴스 생성 과정
1) 수퍼 클래스의 설계도를 보고 메모리를 준비한다.
  예) Car의 model, maker, cc, capacity
2) 자신의 설계도에 따라 메모리 준비한다.
  예) Sedan의 isAutomatic, isSunroof를 준비
3) 모든 변수를 초기화
4) 초기화 문장이 있다면 실행
  => 슈퍼 클래스 ~> 자신의 클래스
5) 인스턴스 블록이 있다면 실행
  => 슈퍼 클래스 ~> 자신의 클래스
6) 자식 클래스 생성자를 실행한다.
  => 자식클래스 ~> 슈퍼클래스

메서드 실행
1) 인스턴스의 설계도 클래스부터 메서드를 찾는다.
2) 없다면 슈퍼 클래스에서 찾는다.
3) 계속 상위 클래스로 따라 가면서 찾는다.
  
*/
