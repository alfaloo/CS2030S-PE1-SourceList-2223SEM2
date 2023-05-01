/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */
public class EmptyList<T> implements SourceList<T> {

  @Override
  public T getFirst() {
    return null;
  }

  @Override
  public SourceList<T> getSecond() {
    return null;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (obj instanceof EmptyList<?>) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public EmptyList<T> filter(BooleanCondition<? super T> bc) {
    return new EmptyList<>();
  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> transformer) {
    return new EmptyList<>();
  }

  @Override
  public String toString() {
    return "EmptyList";
  }

}
