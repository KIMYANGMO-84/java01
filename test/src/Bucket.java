public class Bucket<T> {
  T value;
  Bucket<T> next;

  public Bucket() {
  }
  public Bucket(T v, Bucket<T> next) {
    this.v = v;
    this.next = next;
  }

}
