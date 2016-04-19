package step09;
//패키지 직속 클래스는 static을 붙이지 않는다.
class Score {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  Score(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  // 연산자 추가하기
  void summary() { // 국,영,수 합계를 계산하는 연산자
    this.sum = this.kor + this.eng + this.math;
  }

  void average() {
    this.aver = this.sum / 3f;
  }
}
