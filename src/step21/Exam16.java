// HashpMap - 데이타 꺼내기
package step21;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class Exam16 {
  static class Member {
    String name;
    int age;
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return this.name + "\t" + this.age;
    }

    @Override
    public int hashCode() {
      return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object other) {
      if (other == null || other.getClass() != this.getClass()) {
        return false;
      }
      Member m = (Member)other;
      if(!this.name.equals(m.name)) {
        return false;
      }

      if(this.age != m.age) {
        return false;
      }
      return true;
    }
  }

  public static void main(String[] args) throws Exception {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);
    Member m4 = new Member("홍길동", 20);
    Member m5 = new Member("임꺽정", 30);

    // HashMap<키, 값> map;
    HashMap<String, Member> map = new HashMap<>();
    map.put("aaa", m1);
    map.put("bbb", m2);
    map.put("ccc", m3);
    map.put("ddd", m1); // 키 가 다르면 값을 중복 저장할 수 있다.
    map.put("eee", m2);

    System.out.println("\t HashMap");
    System.out.println("---------------------------");
    System.out.printf("%s\t%s\t%s\n", "Key", "이름", "나이");
    Set<Map.Entry<String, Member>> entrySet = map.entrySet(); // 리턴 값 : [키,값] 의 목록
      //entrySet에 들어있는 객체들은 Map.Entry 타입의 객체이다.
      // => Entry 타입이 java.util 패키지에 있는지 찾아보라!
      // => Map 인터페이스의 중첩 인터페이스 이다.
      // Set에 어떤 타입의 객체가 들어있는지 선언했기 때문에
      // 다음과 같이 변수의 타입을 지정할 수 있다.
    for (Map.Entry entry : entrySet) {
      // 위와 같이 항목의 타입을 정확히 지정하면,
      // 그 타입의 메서드를 사용할 수 있다
      System.out.printf("%s-%s\n", entry.getKey(), entry.getValue());
    }
  }
}

/*
# Member를 HashSet에 저장할 때 주의할 점!
- 같은 값을 갖는 경우 중복저장하지 않도록 hashCode()와 equals()를 재정의(Override) 하라
  */
