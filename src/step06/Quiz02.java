/* 주제 : 0부터 n-1까지 수를 원으로 배치할 때,
          특정 값의 맞은 편에 위치해 있는 수를 리턴하는 메서드 정의하기*/
package step06;

public class Quiz02 {
  static int circleOfNumbers(int n, int f) {
    return ((n / 2) + f) % n;
  }
  static int add(int a, int b) {
    return a + b;
  }
  static int mul(int a, int b) {
    return a * b;
  }
  static int div(int a, int b) {
    return a / b;
  }
  public static void main(String[] args) {
    int n = 10;
    int f = 3;
    System.out.println(circleOfNumbers(n, f));

  }
}
