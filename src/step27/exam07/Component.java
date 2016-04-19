// 배열 속성 다루기

package step27.exam07;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// => 유지 정책을 Runtime로 변경하자
// => 유지 정책을 지정하지 않으면 기본이 Class이다.
// => .class 파일에 주석이 포함된다.
// => 실행할 때 꺼낼 수 있다.
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String[] value();
  
 }
