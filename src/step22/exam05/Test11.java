// 주제 : 인스턴스 읽기 - ObjectInputStream 데코레이터 사용 후
package step22.exam05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;

public class Test11 {
  public static void main(String[] args) throws Exception {
    // 실제 작업을 수행할 객체를 준비한다.
    FileInputStream in0 = new FileInputStream("exam05.Test10.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    ObjectInputStream in = new ObjectInputStream(in1);

    long start = System.currentTimeMillis(); 

    Member2 m1 = (Member2)in.readObject();
    m1. calculateBMI(); // transient필드의 값을 설정한다. BMI 계산 수행
    Member2 m2 = (Member2)in.readObject();
    m2. calculateBMI();
    Member2 m3 = (Member2)in.readObject();
    m3. calculateBMI();

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);

    in.close();
    in1.close();
    in0.close();

    System.out.printf("%s\t%s\t%s\t%s\t%s\n", "이름", "나이", "신장", "체중", "BMI");
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}

/*

*/
