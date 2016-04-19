//오버라이딩(overriding)
package step14.exam05;

public class Test2 {
  public static void main(String[] args) {
    Sedan2 c = new Sedan2();
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
/*
*/
