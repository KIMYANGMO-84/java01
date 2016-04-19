/* 주제 : 스태틱 변수의 활용*/

package step12;

public class Exam10 {
    public static void main(String[] args) {
      //생성자에 변수가 1개라도 존재시 기본생성자가 생성되지 않음

      Car7 car1 = new Car7("티코","대우",800,-5); //
      Car7 car2 = new Car7("그랜져","현대",3000,5);
      Car7 car3 = new Car7();

      /*car1.model = "티코";
      car1.brand = "대우";
      car1.cc = 800;
      car1.pp = 5;

      car2.model = "그랜져";
      car2.brand = "현대";
      car2.cc = 3000;
      car2.pp = 5; */

      car1.setPp(5);

      car3.setModel("코란도");
      car3.setBrand("현대");
      car3.setCc(3500);
      car3.setPp(2);

      System.out.printf("%s\t%s\t%s\t%s\t%s\n", "번호", "제조사", "모델명", "cc", "탑승인원");
      System.out.printf("%d\t%s\t%s\t%d\t%d\n", car1.getCarNumber(), car1.getBrand(), car1.getModel(), car1.getCc(), car1.getPp());
      System.out.printf("%d\t%s\t%s\t%d\t%d\n", car2.getCarNumber(), car2.getBrand(), car2.getModel(), car2.getCc(), car2.getPp());
      System.out.printf("%d\t%s\t%s\t%d\t%d\n", car3.getCarNumber(), car3.getBrand(), car3.getModel(), car3.getCc(), car3.getPp());

  }
}

/*
*/
