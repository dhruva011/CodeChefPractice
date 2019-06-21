import java.util.*;
import java.math.*;
class DIVIDING {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] c = new int[n];
    
    BigInteger sum = new BigInteger("0");
    for(int i=0;i<n;i++){
      c[i] = in.nextInt();
      sum = sum.add(new BigInteger(c[i]+""));
    }
    
    BigInteger sumOfAP = new BigInteger(n+"");
    BigInteger temp = new BigInteger((n+1)+"");
    
    sumOfAP = (sumOfAP.multiply(temp)).divide(new BigInteger("2"));
    
    //System.out.println("Number Sum = "+sum+" AP Sum = "+sumOfAP);
    
    if(sum.compareTo(sumOfAP)==0)
      System.out.println("YES");
    else
      System.out.println("NO");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
