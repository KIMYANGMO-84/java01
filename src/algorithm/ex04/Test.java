package algorithm.ex04;

public class Test {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("홍길동"); // index = 0
    list.add("임꺽정"); // index = 1
    list.add("유관순"); // index = 2
    list.add("안창호"); // index = 4
    list.add("김원봉"); // index = 5
    list.add("김구");   // index = 6
    
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    list.add(0, "aaaaa");
    list.add(3, "ccccc");
    System.out.println("------------------------------------");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
