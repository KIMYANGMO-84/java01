// 주제 : 바이트 읽기
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Test05 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    int b = in.read();
    System.out.println(Integer.toHexString(b));

    b = in.read();
    System.out.println(Integer.toHexString(b));

    b = in.read();
    System.out.println(Integer.toHexString(b));


    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();
  }
}
 
/*
Offset // 상대적인 메모리 주소
*/
