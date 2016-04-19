/* 생성자 오버로딩 */
package step11;
public class Score {
  // 인스턴스 변수
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;

  public Score(String name, int kor, int eng, int math) { // 생성자 클래스명이랑 동일해야함
    this.name = name;
    this.setKor(kor);
    this.setEng(eng);
    this.setMath(math);
  }

  // 기존 생성자에 다음 디폴트 생성자를 추가한다.
  // => 오버로딩
  public Score() {}

  private void summary() {
    this.sum = this.kor + this.eng + this.math;
    this.average();
  }

  private void average() {
    this.aver = this.sum / 3f;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return this.kor;
  }

  public void setKor(int kor) {
    if (kor >= 0 && kor <= 100){
        this.kor = kor;
        this.summary();
    }
  }

  public int getEng() {
    return this.eng;
  }

  public void setEng(int eng) {
    if (eng >= 0 && eng <= 100) {
    this.eng = eng;
    this.summary();
    }
  }

  public int getMath() {
    return this.math;
  }

  public void setMath(int math) {
    if (math >= 0 && math <= 100) {
    this.math = math;
    this.summary();
    }
  }

  public int getSummary() {
    return this.sum;
  }

  public float getAverage() {
    return this.aver;
  }
}
