// 주제 : 원시 타입 값을 출력하기 - 코드 개선(static 변수 사용)
package step22.exam04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class Test04 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test04.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;
    MyDataOutputStream2.out = out;
    MyDataOutputStream2.writerShort(no);
    MyDataOutputStream2.writerInt(kor);
    MyDataOutputStream2.writerInt(eng);
    MyDataOutputStream2.writerInt(math);

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }

}

/*

*/
