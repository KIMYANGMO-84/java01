
package step23.step04;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends AbstractHello {
  ArrayList<String> list = new ArrayList<>();
  public HelloJp() {
    list.add("おはよう");
    list.add("こんにちは。");
    list.add("こんばんは");
  }
  public String greet() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if (4 <= hour && hour < 12) {
      return list.get(0);
    } else if (12 <= hour && hour < 20) {
      return list.get(1);
    } else {
      return list.get(2);
    }
  }
}
