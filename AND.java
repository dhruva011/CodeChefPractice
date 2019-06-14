import java.util.*;
import java.math.*;
class AND {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] num = new int[n];
    
    for(int i=0;i<n;i++){
     num[i] = in.nextInt(); 
    }
    
    BigInteger sum = new BigInteger("0");
    for(int i=0;i<n;i++){
      if(num[i]!=0)
      for(int j=i+1;j<n;j++){
       //System.out.println("Index i="+i+" and Index j="+j);
       sum = sum.add(new BigInteger(""+(num[i]&num[j])));
      }
    }
    System.out.println(sum);
    
  }
  
  
}
