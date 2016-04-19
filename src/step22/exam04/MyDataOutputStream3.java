package step22.exam04;

import java.io.OutputStream;
import java.io.IOException;

public class MyDataOutputStream3 {
  OutputStream out;

  // 생성자의 존재 이유?
  // => 객체를 사용하는데 필요한 최소한의 준비를 시키는 메서드
  public MyDataOutputStream3(OutputStream out) {
    this.out = out;
  }

  public void writerShort(short value) throws IOException {
    out.write(value >> 8);
    out.write(value);
  }

  public void writerInt(int value) throws IOException {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }
}
