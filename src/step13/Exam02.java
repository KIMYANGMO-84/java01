// 랩퍼 클래스와 오토박싱
package step13;

public class Exam02 {
  public static void main(String[] args) {
    // auto-boxing
    // auto-boxing => 내부에서 랩퍼 클래스의 인스턴스 생성
    Integer i = 10; // new Integer(10);

    // auto-unboxing
    // => 랩퍼 클래스의 인스턴스 값을 원시 타입 값으로 자동 리턴한다.

    Integer i2 = new Integer(100);
    int v1 = i2; // == i2.intValue(); 

    System.out.println(i);
    System.out.println(v1);

  }
}
  /*
  */
