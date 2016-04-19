public class LinkedList<T> {
  Bucket<T> start;
  Bucket<T> end;
  int count;

  public LinkedList() {
    start = new Bucket<T>();
    end = start;
  }

  public void add(T value) {
    end.value = value;
    Bucket<T> nb = new Bucket<T>();
    end.next = nb;
    end = nb;
    count++;
  }

  public void add(int index, T v) {
    if (index < 0 || index > count) {
      return;
    }
    if (index == 0) {
      Bucket<T> nb = new Bucket<T>();
      nb.v = v;
      nb.next = start;
      start = nb;
      count++;
      return;
    }
    if (index == count) {
      add(v);
      return;
    }
    Bucket<T> cursor = start;
    for (int i = 0; i < index -1; i++){
      cursor = cursor.next;
    }
    Bucket<T> nb = new Bucket<T>();
    nb.v = v;
    nb.next = cursor.next;
    cursor.next = nb;
    count++;
  }

  public T remove(int index) {
    if (index < 0 || index >= count) {
      return null;
    }
    T removeB = null;
    count--;
    if (index == 0) {
      removeB = start.v;
      start = start.next;
      return removeB;
    }
    Bucket<T> cursor = start;
    for (int i = 0; i < index -1; i++){
      cursor = cursor.next;
    }
    removeB = cursor.next.v;
    cursor.next = cursor.next.next;
    return removeB;
  }

  public T set(int index, T v) {
    if (index < 0 || index >= count) {
      return null;
    }
    Bucket<T> cursor = start;
    for (int i = 0; i < index -1; i++){
      cursor = cursor.next;
    }
    T temp = cursor.v;
    cursor.v = v;
    return temp;
  }

  public T get(int index) {
    Bucket<T> cursor = start;
    for (int i = 0; i < index; i++){
      cursor = cursor.next;
    }
    return cursor.v;

  }

  public int size() {
    return count;
  }

}
