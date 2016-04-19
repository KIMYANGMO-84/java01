// 애노테이션에 기본값 지정
// 기본 값이 지정된 경우 속성 값을 설정하지 않으면
// 기본 값이 사용된다.

package step27.exam05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// => 유지 정책을 Runtime로 변경하자
// => 유지 정책을 지정하지 않으면 기본이 Class이다.
// => .class 파일에 주석이 포함된다.
// => 실행할 때 꺼낼 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value() default "haha"; // <--속성을 정의할 때 메서드처럼 정의한다. 
 }
