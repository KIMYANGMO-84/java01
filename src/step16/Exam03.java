// java.lang.object 클래스
package step16;

public class Exam03 {
  int age;
  int weight;

  public Exam03(int age, int weight) {
    this.age = age;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "오호라... 하하하";
  }

  //@Override
  //public boolean equals(Object other){

  //}
  public static void main(String[] args) {
    String s1 = "Hello";//new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2)); // 인스턴스가 달라도 해당 인스턴스의 문자열이 같다면 true

    System.out.println("---------");

    Exam03 p = new Exam03(18, 90);
    Exam03 p2 = new Exam03(18, 90);
    System.out.println(p == p2);
    System.out.println(p.equals(p2));
  }
}

/*
String.equals()
- 원래 Object로 부터 상속받은 equals()는 인스턴스가 같은 지를 비교한다.
- String class에서 이 메서드를 재 정의 하였다
  인스턴스가 같은 지 비교하는 대신 인스턴스의 내용이 같은지 비교한다

Exam03.equals()
- Object로 부터 상속받은 메서드이기 때문에 인스턴스가 같은 지를 비교한다.

*/
