/* 주제 : 변수와 메서드 정리*/

package step12;

public class Exam05 {
    public static void main(String[] args) {
      // 인스턴스 변수에 접근하려면 먼저
      // 그 클래스의 인스턴스(클래스 설계도에 따라 준비한 메모리)를 생성한다.

      Car2 car1 = new Car2(); // 인스턴스(model, brand, cc, pp 묶음) 한 개 준비
      Car2 car2 = new Car2();
      Car2 car3 = new Car2();

      car1.model = "티코";
      car1.brand = "대우";
      car1.cc = 800;
      car1.pp = 5;

      car2.model = "그랜져";
      car2.brand = "현대";
      car2.cc = 3000;
      car2.pp = 5;

      car3.model = "코란도";
      car3.brand = "현대";
      car3.cc = 3500;
      car3.pp = 2;

      System.out.printf("%s\t%s\t%s\t%s\n", "제조사", "모델명", "cc", "탑승인원");
      System.out.printf("%s\t%s\t%d\t%d\n", car1.brand, car1.model, car1.cc, car1.pp);
      System.out.printf("%s\t%s\t%d\t%d\n", car2.brand, car2.model, car2.cc, car2.pp);
      System.out.printf("%s\t%s\t%d\t%d\n", car3.brand, car3.model, car3.cc, car3.pp);

  }
}

/*
*/
