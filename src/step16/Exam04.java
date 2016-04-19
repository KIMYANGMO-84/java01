// java.lang.object 클래스
package step16;

public class Exam04 {
  int age;
  int weight;

  public Exam04(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라... 하하하";
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof Exam04)) {
      return false;
    }
    Exam04 obj = (Exam04)other;

    if (this.age != obj.age) {
      return false;
    }

    if (this.weight != obj.weight) {
      return false;
    }

    return true;
  }
  public static void main(String[] args) {
    String s1 = "Hello";//new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2)); // 인스턴스가 달라도 해당 인스턴스의 문자열이 같다면 true

    System.out.println("---------");

    Exam04 p = new Exam04(18, 90);
    Exam04 p2 = new Exam04(18, 90);
    System.out.println(p == p2);
    System.out.println(p.equals(p2));
  }
}

/*
*/
