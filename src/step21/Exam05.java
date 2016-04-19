// Collection API - ArrayLIst
package step21;

import java.util.ArrayList;
import java.util.Date;
import java.util.Comparator;

public class Exam05 {

  static void printList(ArrayList<String> list) {
    System.out.println("---------------------------");
    for (Object element : list) {
      System.out.println(element);
    }
    System.out.println("---------------------------");
  }

  public static void main(String[] args) {
    // main()에서만 사용할 클래스라면, 로컬 중첩 클래스로 만들어라
    class MyComparator implements Comparator<String> {
      @Override
      public int compare(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
      }
    }
    ArrayList<String> list = new ArrayList<>();
    list.add("111");
    list.add("aaa");
    list.add("444");
    list.add("BBB");
    list.add("222");
    list.add("333");
    list.add("aab");
    list.add("Aac");

    System.out.println("\t정렬 전 list");
    printList(list);

    System.out.println("\t정렬 후 list");
    // 이 코드를 유지보수 하는 후임자는 도대체 MyComparator가 어떤 일을 하는 클래스인지 궁금하다
    // 그래서 이 후임자는 위로 스크롤하여 클래스 코드를 확인할 것이다.
    // 확인한 다음에 다시 이 위치로 내려와서 이 코드의 의미를 이해하려고 노력할 것이다.
    
    MyComparator comp = new MyComparator();
    list.sort(comp);
    printList(list);

  }
}
