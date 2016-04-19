// 주제 : 문자 읽기
package step22.exam06;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileInputStream;

public class Test02 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("exam06.Test01.data");

    int c;
    while ((c = in.read()) != -1) { // UTF-8 --> UTF-16
      System.out.println(Integer.toHexString(c));
    }

    in.close();
    System.out.println("-------------------------------------");
    FileInputStream in2 = new FileInputStream("exam06.Test01.data");
    while ((c = in2.read()) != -1) { // byte --> byte
      System.out.println(Integer.toHexString(c));
    }

    in2.close();
  }
}


/*
*/
