// Generalization의 예
// Sedan과 Truck의 공통점을 식별하여 상위 클래스를 정의한다.
// Sedan과 Truck의 공통점을 찾아서 일반적인 기능을 갖는 슈퍼 클래스를 정의한다.
package step14.exam03;

public class Sedan extends Car {
  /* Car클래스로 옮김
  String title; // 모델명
  String company; // 제조사명
  int cc; // cc
  int maxCount; // 수용인원
  */
  boolean isAutomatic;
  boolean isSunroof;
}
