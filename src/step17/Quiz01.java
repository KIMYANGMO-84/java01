/* 5명의 회원정보를 입력 받아서 보관하라!
> java -cp bin step17.Quiz
> 이름 ? 홍길동
> 이메일 ? hong@test.com
> 암호 ? 1111
> 전화 ? 111-1111
> 정말 저장하시겠습니까? (y/n)
> 저장했습니다.
-----------------------------
5번 반복
> 지금까지 입력한 회원 정보는 다음과 같습니다.
홍길동,
*/
package step17;

import java.util.Scanner;

public class Quiz01 {
  public static void main(String[] args) {
   Member m = new Member();
    m.memberAdd();
    m.memberInfo();
  }
}
