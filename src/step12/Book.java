// 책 데이터를 다룰 사용자 정의 데이터 타입 선언
// 책 번호, ISBN, 제목, 저자들[], 출판사, 총 페이지수, 가격, 책 소개
package step12;
public class Book {
  static int bookNo;
  private int count;
  private String bookISBN;
  private String bookTitle;
  private String[] bookWriter;
  private String bookPublisher;
  private int bookPage;
  private int bookPrice;
  private String bookIntroduce;

  public Book() { }
  public Book(String bookISBN, String bookTitle, String[] bookWriter, String bookPublisher) {
    this.bookISBN = bookISBN;
    this.bookTitle = bookTitle;
    this.bookWriter = bookWriter;
    this.bookPublisher = bookPublisher;
  }
  public Book(String bookISBN, String bookTitle, String[] bookWriter, String bookPublisher, int bookPage, int bookPrice, String bookIntroduce) {
    this.bookISBN = bookISBN;
    this.bookTitle = bookTitle;
    //this.bookWriter = bookWriter;
    this.bookPublisher = bookPublisher;
    this.bookPage = bookPage;
    this.bookPrice = bookPrice;
    this.bookIntroduce = bookIntroduce;
  }
  public int getBookNo() {
    return this.bookNo;
  }
  public void setBookNo(int bookNo) {
    this.bookNo = bookNo;
  }

  public String getBookISBN() {
    return this.bookISBN;
  }
  public void setBookISBN(String bookISBN) {
    this.bookISBN = bookISBN;
  }

  public String getBookTitle() {
    return this.bookTitle;
  }
  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getBookWriter(int index) {
    return this.bookWriter[index];
  }
  public void setBookWriter(String[] bookWriter) {
    this.bookWriter = bookWriter;
  }

  public String getBookPublisher() {
    return this.bookPublisher;
  }
  public void setBookPublisher(String bookPublisher) {
    this.bookPublisher = bookPublisher;
  }

  public int getBookPage() {
    return this.bookPage;
  }
  public void setBookPage(int bookPage) {
    this.bookPage = bookPage;
  }

  public int getBookPrice() {
    return this.bookPrice;
  }
  public void setBookPrice(int bookPrice) {
    this.bookPrice = bookPrice;
  }

  public String getBookIntoroduce() {
    return this.bookIntroduce;
  }
  public void setBookIntoroduce(String bookIntroduce) {
    this.bookIntroduce = bookIntroduce;
  }
}
