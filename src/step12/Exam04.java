/* 주제 : 변수와 메서드 정리*/

package step12;

public class Exam04 {
    public static void main(String[] args) {
      Car c = new Car();
      c.model = "티코";
      c.brand = "대우";
      c.cc = 800;
      c.pp = 5;

      System.out.printf("%s\t%s\t%s\t%s\n", "제조사", "모델명", "cc", "탑승인원");
      System.out.printf("%s\t%s\t%d\t%d\n", c.brand, c.model, c.cc, c.pp);
      
  }
}

/*
*/
