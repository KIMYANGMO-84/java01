// 주제 : 원시 타입 값을 출력하기 - 코드 개선(Decorator 패턴)
package step22.exam05; 

import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;

public class Test02 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileInputStream in = new FileInputStream("exam04.Test06.data");
    DataInputStream in2 = new DataInputStream(in);


    short no = in2.readShort();
    int kor = in2.readInt();
    int eng = in2.readInt();
    int math = in2.readInt();

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in2.close();
    in.close();

    System.out.println(no + "," + kor + "," + eng + "," + math);
  }

}

/*

*/
