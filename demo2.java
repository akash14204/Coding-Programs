import java.math.BigDecimal;
import java.math.MathContext;
/*from w ww .j a  v  a  2  s .  c  o m*/
class A {

  public static void main(String[] args) {
    MathContext mc = new MathContext(4);
    BigDecimal bg1 = new BigDecimal("123",mc);
    System.out.println(bg1);

  }
}