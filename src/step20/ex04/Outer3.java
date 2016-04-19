//
package step20.ex04;

public class Outer3 { // top level inner class선언
  int no = 20;
  public void m1() { //인스턴스 멤버에서 접근하기
    System.out.println("Outer3.m()....");
  }
public void m2(){
  class Inner {
    int no = 100;
    public void test(int no) {
      System.out.println(no);
      System.out.println(Inner.this.no);
      //같은 이름을 가진 바깥 클래스의 인스턴스 변수에 접근하는 방법?
      // 바깥 클래스명 this.인스턴스변수
     }
   }

   Inner p = new Inner();
   p.test(8888);



  }
}
