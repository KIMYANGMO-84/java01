package step18.exam01;

public class Test3 {
  public static void main(String[] args) {
    Bucket p = new Bucket();
    //p.value = new String("잠자리");
    p.value = new Integer(20);
    //p.value = new Float(3.14f);
    p.value = new java.util.Date();
  }
}

/* 요구사항
- 이번 프로젝트는 Bucket에 Integer 인스턴스만 저장하기로 했다.
- 물론, 개발자의 실수를 방지하도록 문법적으로 막아야한다.
- 해결책?
  => Bucket은 Date가 아닌 다른 타입의 인스턴스를 저장할 수 있기 때문에 바람직하지 않다.
  => Bucket2는 String만 저장 가능!
  => Date 인스턴스를 저장하는 Bucket3를 만든다.
  => Date 외 다른 타입의 인스턴스를 저장하려 할 때 컴파일 오류가 발생하기 때문에
     개발자가 바로 오류를 확인할 수 있다.



*/
