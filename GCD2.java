import java.util.*;
import java.math.*;
class GCD2 {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int test = in.nextInt();
    while(test-->0){
      String a = in.next();
      String b = in.next();
      System.out.println(gcd(new BigInteger(a),new BigInteger(b)));
    }
  }
  
  static BigInteger gcd(BigInteger a, BigInteger b)
  {
    if (b.compareTo(BigInteger.ZERO)==0)
      return a;
    else
      return gcd(b,a.mod(b));
  }
  
}
