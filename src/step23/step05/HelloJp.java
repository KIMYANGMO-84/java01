
package step23.step05;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> implements Hello {
  public HelloJp() {
    this.add("おはよう");
    this.add("こんにちは。");
    this.add("こんばんは");
  }
  @Override
  public String greet() {
    return this.sayHello(); // 기존 메서드를 손대지 않는다.
  }


  public String sayHello() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    if (4 <= hour && hour < 12) {
      return this.get(0);
    } else if (12 <= hour && hour < 20) {
      return this.get(1);
    } else {
      return this.get(2);
    }
  }
}
