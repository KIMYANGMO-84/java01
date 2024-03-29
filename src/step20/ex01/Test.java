package step20.ex01;


public class Test {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");

    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
/*
# 클래스 사용?
- Bucket 클래스는 이 클래스에서 직접적으로 사용하지 않는다.
- LinkedList에서 자체적으로 사용하는 클래스이다.
- 이런 경우 Bucket 클래스를 LinkedList에서만 사용하도록 설정하는 것이 좋다.
- 해결책?
  => 중첩 클래스 문법을 이용하여 처리

*/
