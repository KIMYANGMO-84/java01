/* 주제 : 클래스 구동 원리 - 클래스 메서드 사용과 클래스 로딩*/
package step08;

public class Exam03 {
  public static void main(String[] args) {
    int a = 20;
    MyClass.setSValue(a);
    System.out.println(MyClass.sValue);

  }
}
/* 클래스를 로딩하는 경우
1) 클래스 메서드(스태틱 메서드)를 사용할 떄
2) 클래스 변수(스태틱 변수)를 사용할 떄
3) 인스턴스를 생성할 때

=> 한 번 클래스를 로딩하면 같은 클래스를 다시 로딩하지 않는다.
=> JVM이 종료할 때 로딩된 클래스가 제거된다.
   한 번 로딩된 클래스는 임의로 메모리에서 제거할 수 없다.
=> ClassLoader 물건을 통해 로딩된 클래스를 재로딩할 수 있다.

클래스 실행과 메모리 사용
1) [Method Area]Exam02.class 로딩한다.
2) [Method Area]main() 호출한다.
3) [Stack] main() 메서드가 사용할 로컬 변수를 준비한다.
4) [Method Area] main()의 int a = 20; 명령어 실행
5) [Method Area] MyClass.class 로딩
6) [Method Area] MyClass의 스태틱 메소드를 실행한다.
7) [Method Area] setSvalue()의 로컬 변수 a를 준비한다.
8) [Stack] main()의 a 값을 setSValue()의 a 파라미터에 저장
9) [Method Area] setSvalue() a의 값을 MyClass.sValue에 저장
10) [Stack] main()으로 돌아간다. --> setSValue()가 사용했던 메모리를 해제한다.
11) [stack] main() 실행 완료 -> main()이 사용한 모든 로컬 메모리 제거
12) JVM이 종료한다.
*/
