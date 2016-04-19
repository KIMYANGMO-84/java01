// 주제 : 다형적 변수의 제약
package step15.exam02;

public class Test {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.id = "aaa";
    s1.pw = "bbb";
    s1.printInfo();
    /*
    Student s2 = new Member();
    s2.id = "cccc";
    s2.pw = "eeee";
    s2.isWorking = true;
    s2.printInfo();
    // 문제점 분석
    // => s2 변수는 Student 변수이기 때문에
    //    문법적으로 Stdent 인스턴스 변수에 접근할 수 있어야 한다.
    // => Member 인스턴스에는 isWorking 변수가 없다.
    // => 만약 s1.isWorking = ture; 문법을 허용한다면,
    //    컴파일할 때는 오류가 발생하지 않겠지만,
    //    실행할 때 반드시 오류가 발생할 것이다.
    // => 왜?
    //    s1이 가리키는 인스턴스는 실제 Member의 인스턴스이고
    //    Member 인스턴스에는 isWorking 변수가 없기 때문이다.
    // => 결론
    //    하위 클래스의 레퍼런스는 상위 클래스의 인스턴스를 가리키지 못하도록
    //    문법적으로 막아놨다.
    */
    Member s3 = new Student();
    s3.id = "cccc";
    s3.pw = "eeee";
    //s3.isWorking = true;
    s3.printInfo();


  }
}
