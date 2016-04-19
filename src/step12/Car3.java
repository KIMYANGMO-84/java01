package step12;

public class Car3 {
  // 자동차 마다 개별 정보를 저장할 변수
  /* static String model;
  static String brand;
  static int cc;
  static int pp; */
  //static 변수선언 - class가 로딩될때 메모리 변수 생성

  String model;
  String brand;
  int cc;
  int pp;

  Car3() {} // 오버로딩

  Car3(String model, String brand, int cc, int pp) {
    this.model = model;
    this.brand = brand;
    this.cc = cc;
    this.pp = pp;

  }
}
