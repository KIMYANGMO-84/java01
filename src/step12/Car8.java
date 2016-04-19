//final의 활용
package step12;

//클래스 앞에 final을 붙이면, 상속 불가!
public final class Car8 {
  //변수 앞에 final을 붙이면, 한번만 값 할당
  static final String model = "Tico";
  static final String brand = "대우";
  static final int cc = 1000;
  static final int pp = 5;

  //메소드 앞에 final을 붙이면, 새정의 불가
  public final void m(final int value) {
    //파라미터도 변수다. 위의 조건과 동일함
  }
}
