// 회원 데이터를 다룰 사용자 정의 데이터 타입 선언하라
// 회원 번호, 이름, 아이디, 암호, 전화, 이메일
package step12;

public class Member {
  static int count;
  private int memberNo;
  private String memberName;
  private String memberID;
  private String memberPW;
  private String memberPhoneNumber;
  private String memberEmail;
  {
    this.memberNo = ++Member.count;
  }

  public Member() {}
  public Member(String memberID, String memberEmail, String memberPW) {
      this.memberID = memberID;
      this.memberEmail = memberEmail;
      this.memberPW = memberPW;
  }
  public Member(String memberName, String memberID, String memberEmail, String memberPW, String memberPhoneNumber) {
    this.memberName = memberName;
    this.memberID = memberID;
    this.memberPW = memberPW;
    this.memberPhoneNumber = memberPhoneNumber;
    this.memberEmail = memberEmail;
  }

  public int getMemeberNo() {
    return this.memberNo;
  }
  public void setMemeberNo(int memeberNo) {
    this.memberNo = memberNo;
  }

  public String getMemberName() {
    return this.memberName;
  }
  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public String getMemberID() {
    return this.memberID;
  }

  public void setMemberID(String memberID) {
    this.memberID = memberID;
  }

  public String getMemberPW() {
    return this.memberPW;
  }

  public void setMemberPW(String memberPW) {
    this.memberPW = memberPW;
  }

  public String getMemberPhoneNumber() {
    return this.memberPhoneNumber;
  }

  public void setMemberPhoneNumber(String memberPhoneNumber) {
    this.memberPhoneNumber = memberPhoneNumber;
  }

  public String getMemberEmail() {
    return this.memberEmail;
  }

  public void setMemberEmail(String memberEmail) {
    this.memberEmail = memberEmail;
  }

}
