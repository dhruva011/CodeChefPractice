import java.math.*;
import java.util.*;
class MARBLES {
  
  
  public static void main(String[] args) { 
      Scanner in = new Scanner(System.in);
      int testcases = in.nextInt();
      for(int i=0;i<testcases;i++){
       int n = in.nextInt();
       int k = in.nextInt();
       
       //why n-1 and k-1 ? because use Star and Bar Technique to put n items in k group
       System.out.println(combination(n-1,k-1));
      }
  }
  
  //Calculating nCr here 
    static long combination(int n, int r) {
    if(r > n - r) r = n - r; // because C(n, r) == C(n, n - r)
    long ans = 1;
    long i;

    for(i = 1; i <= r; i++) {
        ans *= n - r + i;
        ans /= i;
    }
    return ans;
    }
 
}
