package step23.step03;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> {
  public HelloJp() {
    this.add("おはよう");
    this.add("こんにちは。");
    this.add("こんばんは");
  }
  public String sayHello() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if (4 <= hour && hour < 12) {
      return this.get(0);
    } else if (12 <= hour && hour < 20) {
      return this.get(1);
    } else {
      return this.get(2);
    }
  }
}
