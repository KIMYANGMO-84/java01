// List vs Set
package step21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.AbstractCollection;

public class Exam09 {
  static void printList(AbstractCollection<String> list) {
    System.out.println("---------------------------");
    for (Object element : list) {
      System.out.println(element);
    }
    System.out.println("---------------------------");
  }

  public static void main(String[] args) throws Exception {
    ArrayList<String> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("홍길동");
    list.add("임꺽정");

    HashSet<String> set = new HashSet<>();
    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("홍길동");
    set.add("임꺽정");

    System.out.println("\t list");
    printList(list);

    System.out.println("\t set");
    printList(set);
  }
}

/*
# List
- 데이터 중복을 허용한다.
- 등어간 순서대로 꺼낼 수 있다.

# Set(집합)
- 데이터 중복을 허용하지 않는다.
- 저장할 때 인스턴스의 해시코드(hashCode())를 사용한다.
  => 꺼낼 때 저장한 순서대로 꺼내지지 않는다.
  */
