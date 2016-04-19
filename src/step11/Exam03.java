/* 주제 : 메소드 오버로딩과 호출 규칙*/

package step11;

public class Exam03 {
  static void plus(int a, int b) {
    System.out.printf("%d + %d = %d\n", a, b, a + b);
  }

  static void plus(float a, float b) {
    System.out.printf("%f + %f = %f\n", a, b, a + b);
  }

  static float plus(int a, float b) {
    System.out.println("int, float");
    return a + b;
  }

  static void plus(int a, int b, int c) {
    System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
  }

  static void plus(int[] arr) {
    int sum = 0;
    int i = 0;
    for (i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
      if (i > 0) {
        System.out.printf(" + ");
      }
      System.out.printf("%d", arr[i]);
    }
    System.out.printf(" = %d\n", sum);
  }  

  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    plus(10, 20);
    plus(10, 20, 30);
    plus(arr);
    plus(3.04f, 0.1f);
    System.out.println(plus(3, 0.14f));
  }
}
/* 메소드 오버로딩
- 파라미터의 개수가 다르거나, 파라미터의 타입이 다르다면
  같은 이름을 갖는 메서드를 추가로 선언할 수 있다.
- 의미?
  파라미터의 개수나 타입이 다르더라도 같은 기능을 수행하는 메서드에 대해
  같은 이름을 부여함으로써 프로그래밍의 일관성을 확보하는 문법


같은 이름을 갖는 메서드 호출 규칙
- 메서드를 호출할 때 넘겨주는 값(아규먼트)으로 호출할 메서드를 결정한다.
1) 파라미터의 타입과 개수가 완전히 일치하는 메서드를 찾는다.
2) 없다면, 암시적 형변환을 해서라도 값을 넘겨줄 수 있는 메서드를 찾는다.
3) 없다면, 컴파일오류 발생

*/
