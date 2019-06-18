import java.util.*;
public class KS2 {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    for(int i=0;i<testcases;i++){
     long n = in.nextLong(); 
     solve(n);
    }
   
  }
  
  static void solve(long n){
    int lastDigit = 10-sumOfDigit(n);
    System.out.println(n+""+lastDigit);
  }
  
  static int sumOfDigit(long n){
    int lastDigit = 0;
    int sum = 0;
    while(n>0){
      lastDigit = (int)(n%10);
      n=n/10;
      sum = (int)((sum+lastDigit)%10);
    }
    if(sum!=0)
      return sum;
    else
      return 10;
  }
  
}
