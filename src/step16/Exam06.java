// java.lang.object 클래스
package step16;

public class Exam06 {
  int age;
  int weight;

  public Exam06(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "[" + this.age + "," + this.weight + "]";
  }

  @Override
  public boolean equals(Object other) {
    if (other == null || !(other instanceof Exam06)) {
      return false;
    }
    Exam06 obj = (Exam06)other;

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
    Exam06 p1 = new Exam06(18, 90);
    System.out.println(p1); 
    System.out.println(p1.toString());
  }
}

/*
toString() 재정의 하는 이유?
- 간단하게 인스턴스의 값을 확인하고 싶을 때
*/
