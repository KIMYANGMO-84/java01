// Collection API - ArrayLIst
package step21;

import java.util.ArrayList;
import java.util.Date;

public class Exam01 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("홍");
    list.add("임");
    list.add(new Integer(10));
    list.add(new Date());

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
