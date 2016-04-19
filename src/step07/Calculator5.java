package step07;
// 인스턴스 메소드


public class Calculator5 {
  // 개별 데이터 저장 변수  => "인스턴스 변수"

  int result;

  // 인스턴스 메서드를 실행할 때 넘어오는 인스턴스 주소는
  // 메서드의 감춰진 변수인 this에 자동 보관된다.
  // => 이 메서드를 호출할 때는 반드시 인스턴스 주소를 줘야한다.
  // => 그래서 "인스턴스 메서드"라 부른다.

  public void minus(int a) {
    this.result -= a;
  }
  public void plus(int a) {
    this.result += a;
  }
  public void multiple(int a) {
    this.result *= a;
  }
  public void divide(int a) {
    this.result /= a;
  }
}
