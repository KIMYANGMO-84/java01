// HashSet vs hashCode
package step21;

import java.util.HashSet;

public class Exam10 {
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
# HashSet이 데이터를 저장하는 방법
- 값을 저장하기 전에 깆ㄴ에 저장된 객체 중에 같은 값을 가진 객체가 있는지 검사한다.
  => 검사방법?
    1) hashCode()의 값을 비교
    2) 해시값이 같으면 한 번 더 equals()로 값을 비교한다.
    => equals() 마버 같다고 나오면 중복 데이터로 간주하여 저장하지 않는다.
  */
