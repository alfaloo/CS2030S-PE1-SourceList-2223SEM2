 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */
 public class Pair<T> implements SourceList<T> {
  private T first;
  private SourceList<T> second;

  public Pair(T first, SourceList<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public T getFirst() {
    return this.first;
  }

  @Override
  public SourceList<T> getSecond() {
    return this.second;
  }

  @Override
  public int length() {
    return 1 + second.length();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (obj instanceof Pair<?>) {
      @SuppressWarnings("unchecked")
      Pair<?> list = (Pair<?>) obj;
      if (list.getFirst().equals(this.first)) {
        return list.getSecond().equals(this.second);
      }
    }

    return false;
  }

  @Override
  public SourceList<T> filter(BooleanCondition<? super T> bc) {
    if (bc.test(this.first)) {
      return new Pair<>(this.first, this.second.filter(bc));
    } else {
      return this.second.filter(bc);
    }
  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> transformer) {
    return new Pair<>(transformer.transform(this.first), this.second.map(transformer));
  }

  @Override
  public String toString() {
    return this.first + ", " + this.second;
  }

}
