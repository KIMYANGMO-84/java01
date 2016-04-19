package step07;
// 개별적으로 중간 계산 결과를 저장할 변수를 추가한다.


public class Calculator3 {
  // 개별 데이터 저장 변수  => "인스턴스 변수"
  // => 데이터를 개별적으로 관리하고 싶을 때 사용하는 변수
  // => new 명령을 통해 이 변수를 별도로 준비해야 한다.
  // => 즉, 클래스 이름으로 사용할 수 없다.
  // => 별도로 준비한 변수의 주소가 있어야만 사용할 수 있다.
  int result;

  // 메소드에서 인스턴스 변수를 사용하려면
  // 그 인스턴스가 생성된 메모리의 주소를 알아야 한다.
  static int plus(Calculator3 that, int a) {
    return that.result += a;
  }
  static int minus(Calculator3 that, int a) {
    return that.result -= a;
  }
  static int multiple(Calculator4 that, int a) {
    return that.result *= a;
  }
  static int divide(Calculator4 that, int a) {
    return that.result /= a;
  }

}
