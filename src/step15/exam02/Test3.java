// 주제 : 다형적 변수의 형변환
package step15.exam02;

public class Test3 {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.id = "aaa";
    s1.pw = "bbb";
    s1.printInfo();

    Member s3 = new Member();
    s3.id = "cccc";
    s3.pw = "eeee";
    ((Student)s3).isWorking = true;
    s3.printInfo();
  }
}
