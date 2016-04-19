package algorithm.ex02;

public class Test {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push("홍길동"); // index = 0
    stack.push("임꺽정"); // index = 1
    stack.push("유관순"); // index = 2
    stack.push("안창호"); // index = 3
    stack.push("김원봉"); // index = 4
    stack.push("김구");   // index = 5

    int length = stack.size();
    for (int i = 0; i < length; i++) {
      System.out.println(stack.pop());
    }
  }
}
