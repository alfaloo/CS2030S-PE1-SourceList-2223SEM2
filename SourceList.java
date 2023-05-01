/**
 * CS2030S PE1 Question 2
 * AY20/21 Semester 2
 *
 * @author A0000000X
 */
interface SourceList<T> {
  T getFirst();
  SourceList<T> getSecond();
  // Write your code here

  public int length();

  public boolean equals(Object obj);

  public SourceList<T> filter(BooleanCondition<? super T> bc);

  public <U> SourceList<U> map(Transformer<? super T, ? extends U> transformer);
}
