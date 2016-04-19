// 실행중에 애노테이션 정보를 추출하기
package step27.exam05;

public class Test2 {

  public static void main(String[] args) {
    //1) 클래스 정보를 가져온다.
    Class<?> clazz = Member.class;
    
    //2) 꺼내고 싶은 애노테이션의 타입을 주면,
    // 그 애노테이션의 정보를 리턴한다.
    Component anno = clazz.getAnnotation(Component.class);
    
    // 애노테이션에서 속성 값을 꺼낸다
    System.out.println(anno.value());
    
  }
}

/*# Member 클래스에 첨부된 애노테이션 가져오기
 * - 단 해당 애노테이션의 유지정책이 runtime이어야 가능하다
 * - 리플랙션 API를 사용하여 가져올 수 있다.
 * 
 * #애노테이션이란?
 * - 클래스 파일에 첨부하는 주석이다.
 * - 컴파일러나 JVM이 참고할 때 사용한다.
 * 
 * #애노테이션 유지정책(RetentionPolicy)
 * 1) Source
 *  => 소스 파일에서만 유지된다.
 *  => 컴파일할 때 제거된다.
 *  => 즉 .class파일에 존재하지 않는다.
 * 2) class (기본설정)
 *  => 컴파일 한 후에 .class 파일에 포함된다.
 *  => JVM이 클래스를 로딩할 때 이 애노테이션 정보를  로딩하지 않는다.
 * 3) Runtime
 *  => 컴파일 한 후에 .class 파일에 포함된다.
 *  => JVM이 클래스를 로딩할 때 애노테이션 정보도 함께 로딩한다.
 *  => 실행 중에 정보를 추출할 수 있다. * 
 */
