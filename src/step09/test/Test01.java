package step09.test;
import step09.Info;
public class Test01 {
  public static void main(String[] args) {
    Info info1 = new Info("김", 33, "용인", "010-4319-3314", "kr");
    Info info2 = new Info("조", 33, "광주", "010-1234-1324", "sa");
    info1.country();
    info2.country();
    System.out.printf("%s\t%s\t%s\t%s\t%s\n", "이름", "나이", "주소", "전화번호", "국적");
    System.out.printf("%s\t%d\t%s\t%s\t%s\n", info1.getName(), info1.getAge(), info1.getAddr(), info1.getPn(), info1.getCc());
    System.out.printf("%s\t%d\t%s\t%s\t%s\n", info2.getName(), info2.getAge(), info2.getAddr(), info2.getPn(), info2.getCc());
    }
}
