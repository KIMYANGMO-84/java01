// 주제 : 인스턴스 출력
package step22.exam05;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.BufferedOutputStream;

public class Test08 {  
  public static void main(String[] args) throws IOException {
    Member m1 = new Member("홍길동", 20, 180, 70);
    Member m2 = new Member("임꺽정", 45, 178, 98);
    Member m3 = new Member("메디안", 433, 35, 50);
    // 실제 작업을 수행할 객체를 준비한다.
    FileOutputStream out0 = new FileOutputStream("exam05.Test08.data");
    BufferedOutputStream out1 = new BufferedOutputStream(out0);
    DataOutputStream out = new DataOutputStream(out1);

    long start = System.currentTimeMillis();

    out.writeUTF(m1.name);
    out.writeInt(m1.age);
    out.writeInt(m1.height);
    out.writeInt(m1.weight);

    out.writeUTF(m2.name); 
    out.writeInt(m2.age);
    out.writeInt(m2.height);
    out.writeInt(m2.weight);

    out.writeUTF(m3.name);
    out.writeInt(m3.age);
    out.writeInt(m3.height);
    out.writeInt(m3.weight);
    System.out.println();

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
