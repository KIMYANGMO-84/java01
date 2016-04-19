// 주제 : 원시 타입 값을 출력하기 - 코드 개선
package step22.exam04; 

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;


public class Test02 {
  static void writerShort(OutputStream out, short value) throws IOException {
    out.write(value >> 8);
    out.write(value);
  }

  static void writerInt(OutputStream out, int value) throws IOException {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test02.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    writerShort(out, no);
    writerInt(out, kor);
    writerInt(out, eng);
    writerInt(out, math);

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }

}

/*

*/
