/* 주제 : 변수와 메서드 정리*/

package step12;

public class Exam06 {
    public static void main(String[] args) {
      //생성자에 변수가 1개라도 존재시 기본생성자가 생성되지 않음

      Car3 car1 = new Car3("티코","대우",800,5); // 
      Car3 car2 = new Car3("그랜져","현대",3000,5);
      Car3 car3 = new Car3("코란도","현대",3500,2);

      /*car1.model = "티코";
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
      car3.pp = 2;*/

      System.out.printf("%s\t%s\t%s\t%s\n", "제조사", "모델명", "cc", "탑승인원");
      System.out.printf("%s\t%s\t%d\t%d\n", car1.brand, car1.model, car1.cc, car1.pp);
      System.out.printf("%s\t%s\t%d\t%d\n", car2.brand, car2.model, car2.cc, car2.pp);
      System.out.printf("%s\t%s\t%d\t%d\n", car3.brand, car3.model, car3.cc, car3.pp);

  }
}

/*
*/
