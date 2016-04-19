// 주제 : 인스턴스 읽기 - Buffered 데코레이터 사용 후
package step22.exam05;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;

public class Test09 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileInputStream in0 = new FileInputStream("exam05.Test08.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    DataInputStream in = new DataInputStream(in1);

    long start = System.currentTimeMillis();

    Member m1 = new Member();
    m1.name = in.readUTF();
    m1.age = in.readInt();
    m1.height = in.readInt();
    m1.weight = in.readInt();

    Member m2 = new Member(); 
    m2.name = in.readUTF();
    m2.age = in.readInt();
    m2.height = in.readInt();
    m2.weight = in.readInt();

    Member m3 = new Member();
    m3.name = in.readUTF();
    m3.age = in.readInt();
    m3.height = in.readInt();
    m3.weight = in.readInt();

    long end = System.currentTimeMillis();
    System.out.printf("걸린시간: %d\n", end - start);

    in.close();
    in1.close();
    in0.close();

    System.out.printf("%s\t%s\t%s\t%s\n", "이름", "나이", "신장", "체중");
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
  }
}

/*

*/
