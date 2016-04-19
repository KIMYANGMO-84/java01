// java.lang.object 클래스
package step16;

public class Exam05 {
  int age;
  int weight;

  public Exam05(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라... 하하하";
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof Exam05)) {
      return false;
    }
    Exam05 obj = (Exam05)other;

    if (this.age != obj.age) {
      return false;
    }

    if (this.weight != obj.weight) {
      return false;
    }

    return true;
  }
  @Override
  public int hashCode() {
    StringBuffer buf = new StringBuffer();
    buf.append(Integer.toString(age));
    buf.append(",");
    buf.append(Integer.toString(weight));

    return buf.toString().hashCode();
  }
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = new String("Hello");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.printf("%d --- %d\n", s1.hashCode(), s2.hashCode());

    System.out.println("-----------------------");

    Exam05 p1 = new Exam05(18, 90);
    Exam05 p2 = new Exam05(18, 90);
    Exam05 p3 = new Exam05(1, 890);
    System.out.println(p1 == p2);
    System.out.println(p1.equals(p2));
    System.out.printf("%d --- %d\n", p1.hashCode(), p2.hashCode());
    System.out.printf("%d\n", p3.hashCode());
  }
}

/*
hashCode() 재정의 하는 이유?
- 같은 값을 갖는 인스턴스에 대해 같은 해시코드를 리턴하게 함으로써
  인스턴스 비교를 더 쉽게 만든다
*/
