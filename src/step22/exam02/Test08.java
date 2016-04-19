// 주제 : 바이트 읽기
package step22.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class Test08 {
  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    byte[] buf = new byte[100];
    int len = in.read(buf, 10, 3); //읽은 데이터를 버퍼에 넣는다. 리턴 값은 읽은 개수이다.
    // 10번 방부터 최대 3개를 배열에 넣어라
   len = in.read(buf, 10 + len, 5);

    for (int i = 0; i < 25; i++) {
      System.out.println(Integer.toHexString(buf[i]));
    }
    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    in.close();
  }
} 

/*
Offset // 상대적인 메모리 주소
*/
