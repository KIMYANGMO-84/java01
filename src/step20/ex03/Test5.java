package step20.ex03;

public class Test5 { //local inner class사용 //다른 클래스가 로컬 중첩 클래스를 사용할 수 없다.
  public static void main(String[] args) {
    Outer4 p = new Outer4();
    p.no = 20;
    p.m();//  바깥 클래스의 메소드를 호출하면,
          // 그 내부에서 자신의 inner class를 사용할 것이다.
  }
}
/*
*/
