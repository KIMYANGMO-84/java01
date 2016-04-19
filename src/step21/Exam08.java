// Collection API - ArrayLIst
package step21;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Comparator;


public class Exam08 {
  static void printList(ConcurrentLinkedQueue<String> list) {
    System.out.println("---------------------------");
    String value = null;
    while ((value = list.poll()) != null) {
      System.out.println(value);
    }

    System.out.println("---------------------------");
  }
  public static void main(String[] args) throws Exception {
    ConcurrentLinkedQueue<String> list = new ConcurrentLinkedQueue<>();
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

    // System.out.println("\t정렬 후 list");
    // list.sort(new Comparator<String>() {
    //   @Override
    //   public int compare(String s1, String s2) {
    //     return s1.toLowerCase().compareTo(s2.toLowerCase());
    //   }
    // });
    // printList(list);
  }
}
