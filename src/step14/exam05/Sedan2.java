package step14.exam05;

public class Sedan2 extends Car {

  boolean isAutomatic;
  boolean isSunroof;
  @Override
  public void printInfo() {
    // 재정의 하기전에 메소드를 호출하는 방법
    // 슈퍼 키워드 사용
    super.printInfo();
    System.out.printf("자동기어 : %b\n", this.isAutomatic);
    System.out.printf("썬루프 : %b\n", this.isSunroof);
  }
}

/* @override
- 컴파일러에게 슈퍼클래스의 메소드를 제정의한다는것을 알리는 명령어이다.
- 즉 현재 메서드의 시그너처와 일치하는 슈퍼클래스의 메서드가 있는지 검사하라는 뜻
- 만약 없다면 오버라이딩이 아니기 때문에 컴파일 오류가 발생한다.
=> 개발자의 오타로인한 버그를 줄일 수 있다.
컴파일러에게 지시를 하는 아주 특별한 주석이다.
컴파일러나 JVM에게 지시나 조언 등을 제공하기 위해 작성하는 주석을
"Annotation"이라고 부른다.
*/
