// 주제 : 원시 타입 값을 출력하기 - Java에서 제공하는 데코레이터 사용하기
package step22.exam05; 

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;


public class Test01 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileOutputStream out = new FileOutputStream("exam05.Test01.data");

    // FileOutputStream에다가 데코레이터를 붙인다.
    // => 원시 타입을 바이트 단위로 쪼개서 출력하는 기능을 갖고 있다.
    // => 이런 데코레이터 클래스를 "Data Processing Stream Class"라 부른다.
    DataOutputStream out2 = new DataOutputStream(out);
    //작업할 객체에 보조 기능을 장착한다.
    // => 보조 기능을 가진 객체를 "데코레이터(decorator)"라 부른다.
    // => 보조 기능은 필요할때 언제나 붙일 수 있다.
    //    필요 없으면 떼면 된다.
    // OutputStreamDecorator1 d1 = new OutputStreamDecorator1(out);
    // OutputStreamDecorator2 d2 = new OutputStreamDecorator2(out);

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    out2.writeShort(no);
    out2.writeInt(kor);
    out2.writeInt(eng);
    out2.writeInt(math);

    // 자원을 해제할 때 맨 마지막에 연결된 객체부터 해제하라!
    out2.close();
    out.close();
  }

}

/*

*/
