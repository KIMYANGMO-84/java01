// 기존 클래스에 기능을 추가하기
/*
 * 방법2) 
 * - 상속을 통해 기능을 추가한다.
 * 
 */

package designpattern.command.exam03;

public class Test {

  public static void main(String[] args) {
    Calculator2 c = new Calculator2();
    //슈퍼클래스의 기능 사용
    c.plus(10, 20);
    c.minus(10, 20);
    // 서브 클래스에서 추가한 기능 사용
    c.multiple(2, 10);
  }

}
