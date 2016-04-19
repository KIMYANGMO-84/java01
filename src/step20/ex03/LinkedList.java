package step20.ex03;

public class LinkedList {
  // 중첩 클래스 선언 - LinkedList에서만 사용할 클래스이다.
  private class Bucket {
    Object value;
    Bucket next;

    public Bucket() {
    }

    public Bucket(Object value, Bucket next) {
      this.value = value;
      this.next = next;
    }
  }
  Bucket start;
  Bucket end;
  int count;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public int size() {
    return count;
  }

  public void add(Object value) {
    end.value = value;
    Bucket newBucket = new Bucket();
    end.next = newBucket;
    end = newBucket;
    count++;
  }

  public void add(int index, Object value) {
    if (index < 0 || index > count) {
      return;
    }
    if (index == 0) {
      Bucket newBucket = new Bucket(value, start);
      start = newBucket;
      count++;
      return;
    }
    if (index == count) {
      add(value);
      return;
    }
    Bucket cursor = start;
    for (int i = 0; i < (index-1); i++) {
      cursor = cursor.next;
    }
    Bucket newBucket = new Bucket(value, cursor.next);
    cursor.next = newBucket;
    count++;
    return;
  }

  public Object get(int index) {
    Bucket cursor = start;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public Object remove(int index) {
    if (index < 0 || index >= count) {
      return null;
    }
    if (index == 0){
      Bucket removeBucket = start;
      start = start.next;
      count--;
      return removeBucket;
    }
    Bucket cursor = start;
    for (int i = 0; i < (index-1); i++) {
      cursor = cursor.next;
    }
    Bucket removeBucket = cursor.next;
    cursor.next = cursor.next.next;
    count--;
    return removeBucket;
  }

  public Object set(int index, Object value) {
    if (index < 0 || index >= count) {
      return null;
    }
    Bucket cursor = start;
    for (int i = 0; i < (index-1); i++) {
      cursor = cursor.next;
    }
    cursor.value = value;
    return cursor.value;
  }
}
