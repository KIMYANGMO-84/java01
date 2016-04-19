package step22.exam04;

import java.io.InputStream;
import java.io.IOException;

public class MyDataInputStream extends InputStream {
  InputStream base;

  public MyDataInputStream(InputStream base) {
    this.base = base;
  }

  @Override
  public int read() throws IOException {
    return base.read();
  }

  @Override
  public int read(byte[] bytes) throws IOException {
    return base.read(bytes);
  }

  @Override
  public int read(byte[] bytes, int offset, int length) throws IOException {
    return base.read(bytes, offset, length);
  }

  public short readShort() throws IOException {
    int result = 0;                 // 예) 0x00000000
    int temp = this.read();         // 예) 0x0000002a
    result += (temp << 8);  // 예) result =  0x00002a00

    temp = this.read();             // 예) 0x0000003b
    result += (temp);       // 예) result = 0x00002a3b
    return (short)result;
  }

  public short readInt() throws IOException {
    int result = 0;
    int temp = this.read();
    result += (temp << 24);

    temp = this.read();
    result += (temp << 16);

    temp = this.read();
    result += (temp << 8);

    temp = this.read();
    result += (temp);
    return (short)result;
  }
}
