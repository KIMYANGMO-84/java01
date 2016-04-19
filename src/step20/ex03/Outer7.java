package step20.ex03;

public class Outer7 { // anonymous inner class선언 2
  int no;

  //익명 중첩 클래스에 메서드 추가하기
  void m() {
    Object obj1 = new Object(){
      public void test() {
        System.out.println("호출방법?");
      }
        @Override
      public String toString() {
        return "오호라...ㅋㅋ";
      }
    };
      System.out.println(obj1);

  }
}
/*
#
*/
