// 주제 : 인스턴스 출력 - ObjectOutputStream 데코레이터 사용
package step22.exam05;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;

public class Test10 {
  public static void main(String[] args) throws IOException {
    Member2 m1 = new Member2("홍길동", 20, 180, 70);
    Member2 m2 = new Member2("임꺽정", 45, 178, 98);
    Member2 m3 = new Member2("메디안", 43, 35, 50);

    FileOutputStream out0 = new FileOutputStream("exam05.Test10.data");
    BufferedOutputStream out1 = new BufferedOutputStream(out0);
    ObjectOutputStream out = new ObjectOutputStream(out1);

    long start = System.currentTimeMillis();

    out.writeObject(m1);
    out.writeObject(m2);
    out.writeObject(m3); 

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);

    out.flush(); // 버퍼에 남아있는 데이터 강제 방출
    out.close();
    out1.close();
    out0.close();

  }

}

/*

*/
