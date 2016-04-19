/* 주제 : 클래스 구동 원리 - 인스턴스와 클래스 로딩*/
package step08;

public class Exam05 {
  public static void main(String[] args) {
    MyClass.sValue = 20;
    MyClass obj; // 레퍼런스 변수를 선언할 때 클래스를 로딩하지 않는다.
    obj = new MyClass();
    obj.setIValue(MyClass.sValue);
    obj = new MyClass();
    obj.setIValue(MyClass.sValue);
    System.out.println(obj.iValue);

  }
}
/* 인스턴스 생성
- 클래스에 선언된 인스턴스 변수를 Heap 메모리 영역에 준비한다.

=> 한 번 클래스를 로딩하면 같은 클래스를 다시 로딩하지 않는다.
=> JVM이 종료할 때 로딩된 클래스가 제거된다.
   한 번 로딩된 클래스는 임의로 메모리에서 제거할 수 없다.
=> ClassLoader 물건을 통해 로딩된 클래스를 재로딩할 수 있다.
*/
