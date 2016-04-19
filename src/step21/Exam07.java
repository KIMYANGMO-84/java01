// Collection API - ArrayLIst
package step21;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Comparator;
import java.util.EmptyStackException;

public class Exam07 {
  static void printList(Stack<String> list) {
    System.out.println("---------------------------");
    while (true) {
      try {
        System.out.println(list.pop());
      } catch (EmptyStackException e) {
        break;
      }

    }

    System.out.println("---------------------------");
  }
  public static void main(String[] args) {
    Stack<String> list = new Stack<>();
    list.push("111");
    list.push("aaa");
    list.push("444");
    list.push("BBB");
    list.push("222");
    list.push("333");
    list.push("aab");
    list.push("Aac");

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
