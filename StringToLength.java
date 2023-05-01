public class StringToLength implements Transformer<String,Integer> {
  
  @Override
  public Integer transform(String s) {
    if (s == null) {
      return 0;
    } else {
      return s.length();
    }
  }
}
