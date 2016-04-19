package algorithm.ex02;

public class Stack {
  Bucket top;
  Bucket bottom;
  int count;
  public Stack() {
    top = new Bucket();
    bottom = top;
  }
  public void push(Object value) {
    top = new Bucket(value, top);
    count++;
  }

  public int size() {
    return count;
  }

  public Object pop() {
    Bucket oldTop = top;
    top = top.prev;
    count--;
    return oldTop.value;
  }
}
