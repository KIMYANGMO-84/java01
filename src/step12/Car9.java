//final의 활용
package step12;

//클래스 앞에 final을 붙이면, 상속 불가!
public final class Car9 {
  //변수 앞에 final을 붙이면, 한번만 값 할당
  // => 상수 값으로 사용하기 위해!
  // => 조회 용도로 사용하고 싶을 때
  // => 상수로 사용할 것이기 때문에 인스턴스 마다 개별적으로 만들필요가 없다
  //    그래서 static 변수로 만든다.
  // => 따라서 상수 변수는 보통 static 이면서 final이 된다.
  static final String model = "TICO";
  // static final String brand;
  // static final int cc;
  // static final int pp;

  //메소드 앞에 final을 붙이면, 새정의 불가
  public final void m(final int value) {
    //파라미터도 변수다. 위의 조건과 동일함
  }
}
