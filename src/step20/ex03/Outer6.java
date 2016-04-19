package step20.ex03;

public class Outer6 { // anonymous inner class선언 2
  int no;

  //익명 중첩 클래스에 메서드 추가하기
  Object obj1 = new Object(){
    public void test() {
      System.out.println("호출방법?");
    }

    @Override
    public String toString() {
      return "오호라...ㅋㅋ";
    }
  };
  Object obj2 = new Object(){};
  Object obj3 = new Object(){};
  Object obj4 = new Object(){};
  void m() {
    System.out.println(obj1);    
    try {
      Class classInfo = obj1.getClass();
      java.lang.reflect.Method methodInfo = classInfo.getMethod("test");
      methodInfo.invoke(obj1);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
/*
#
*/
