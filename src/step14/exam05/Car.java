
package step14.exam05;

public abstract class Car {
  String model; // 모델명
  String maker; // 제조사명
  int cc; // cc
  int capacity; // 수용인원
  
  public void printInfo() {
    System.out.printf("모델 : %s\n", this.model);
    System.out.printf("제조사 : %s\n", this.maker);
    System.out.printf("cc : %d\n", this.cc);
    System.out.printf("최대수용인원 : %d\n", this.capacity);


  }
}
