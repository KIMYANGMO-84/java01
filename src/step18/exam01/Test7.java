package step18.exam01;

public class Test7 {
  public static void main(String[] args) {
    Bucket p1 = new Bucket();
    Bucket6<String> p2 = new Bucket6<String>();

    p1.value = new String("잠자리");
    p2.value = new String("구글");


    String s1 = (String)p1.value; // Bucket의 value는 object이므로 타입 캐스팅 필요
    String s2 = p2.value;
  }
}

/* Object와의 차이


*/
