// 패키지 멤버 클래스를 이용하여 상수 다루기
package step20.ex05;

public class Test2 {
  public static void main(String[] args) {
    int gender = R.gender.WOMAN;
    int working = R.working.STUDENT;
    int tech = R.tech.JAVA;
  }
}
/*
# top level 중첩 클래스를 이용한 다양한 상수 값의 관리
- 여러개의 .java 파일을 생성하지 않고
  하나의 .java 파일에서 일관되게 관리 가능
- top level 중첩 클래스를 사용하면, 일반 변수처럼 접근할 수 있어서 편리하다.
*/
