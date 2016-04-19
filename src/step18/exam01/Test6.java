package step18.exam01;

public class Test6 {
  public static void main(String[] args) {
    Bucket6<String> p1 = new Bucket6<String>();
    Bucket6<Integer> p2 = new Bucket6<Integer>();
    Bucket6<Float> p3 = new Bucket6<Float>();
    Bucket6<java.util.Date> p4 = new Bucket6<java.util.Date>();
    p1.value = new String("잠자리");
    p2.value = new Integer(20);
    p3.value = new Float(3.14f);
    p4.value = new java.util.Date();
  }
}

/* 대안책?
 => 한 개의 클래스로 다양한 타입에 대응할 수 있는 문법이 필요!
 => "Generic" 등장!!!!!!


*/
