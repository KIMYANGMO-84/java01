// HashSet vs hashCode
package step21;

import java.util.HashSet;

public class Exam11 {
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
  static void printList(HashSet<Member> list) {

    for (Object element : list) {
      System.out.println(element);
    }
    System.out.println("---------------------------");
  }

  public static void main(String[] args) throws Exception {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);
    Member m4 = new Member("홍길동", 20);
    Member m5 = new Member("임꺽정", 30);

    System.out.println("\t 해시코드");
    System.out.println("---------------------------");
    System.out.printf("m1 = %d\n", m1.hashCode());
    System.out.printf("m2 = %d\n", m2.hashCode());
    System.out.printf("m3 = %d\n", m3.hashCode());
    System.out.printf("m4 = %d\n", m4.hashCode());
    System.out.printf("m5 = %d\n", m5.hashCode());
    System.out.println("---------------------------");

    HashSet<Member> set = new HashSet<>();
    set.add(m1);
    set.add(m2);
    set.add(m3);
    set.add(m4);
    set.add(m5);

    System.out.println("\t set");
    System.out.println("---------------------------");
    System.out.printf("%s\t%s\n", "이름", "나이");
    printList(set);
  }
}

/*
# Member를 HashSet에 저장할 때 주의할 점!
- 같은 값을 갖는 경우 중복저장하지 않도록 hashCode()와 equals()를 재정의(Override) 하라
  */
