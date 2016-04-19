//인터 페이스 사용 전
// => 규칙이 없기 때문에 클래스를 만드는 사람마다, 제각각으로 메서드를 만들 것이다.
// => 그러면 그 클래스를 사용하는 개발자는 항상 클래스의 메서드의 형식을 살펴서 호출해야 한다.
// => 해결책;
//  -->호출 규직을 정의하라!

package step23.step01;

public class Test {
  public static void main(String[] args) {
    //JVM 옵션: -Dlang값
    // 값 => en, ko
    // null => ko
    String lang = System.getProperty("lang");
    System.out.println(lang);
    String message = null;

    if ("en".equals(lang)) {
      HelloEn obj = new HelloEn();
      message = obj.greet();
    } /*else if ("jp".equals(lang)) {
      HelloJp obj2 = new HelloJp();
      message = obj2.sayHello(); // <-- 규칙이 없으니 메서드를 마음대로 만든다.
      // 문제는 메서드 이름이 달라 이 메서드를 호출하는 개발자가 번거롭다.
//    } */else {
//      Hello obj1 = new HelloEn();
//      message = obj1.greet();
    }

    System.out.println(message);
  }
}
