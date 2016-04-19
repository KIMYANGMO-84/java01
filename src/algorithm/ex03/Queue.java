package algorithm.ex03;

public class Queue {
  Bucket head;
  Bucket tail;
  int queueSize;

  public Queue() {
    head = new Bucket();
    tail = head;
  }
  public void put(Object value) {
    tail.value = value;
    Bucket newBucket = new Bucket();
    tail.next = newBucket;
    tail = newBucket;
    queueSize++;
  }

  public int size() {
    return queueSize;
  }

  public Object poll() {
    if (queueSize == 0) {
      return null;
    }
    Object pollQueue = head.value;
    head = head.next;
    queueSize--;

    return pollQueue;
  }
}
