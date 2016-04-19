// 여러개의 속성 선언하기

package step27.exam06;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// => 유지 정책을 Runtime로 변경하자
// => 유지 정책을 지정하지 않으면 기본이 Class이다.
// => .class 파일에 주석이 포함된다.
// => 실행할 때 꺼낼 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value() default "haha"; // <--선택 입력 속성 
  String title(); // <-- 필수 입력 속성
  int no() default 100; // <-- 선택 입력 속성
 }
