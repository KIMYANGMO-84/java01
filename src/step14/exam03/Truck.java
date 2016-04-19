// Generalization의 예
// Sedan과 Truck의 공통점을 식별하여 상위 클래스를 정의한다.

package step14.exam03;

public class Truck extends Car {
  /* Car 클래스로 옮김
  String model; // 모델명
  String maker; // 제조사명
  int cc; // cc
  int maxSize; // 수용인원
  */
  float weight;
  boolean isDump;
}
