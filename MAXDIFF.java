import java.util.*;
import java.math.*;

class MAXDIFF {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    
    for(int i=0;i<testcases;i++){
     int n = in.nextInt();
     int k = in.nextInt();
     long sum = 0;
     List<Integer> num = new ArrayList<Integer>();
     
     for(int j=0;j<n;j++){
       int number = in.nextInt();
       num.add(number);
       sum = sum+number;
     }
     
     Collections.sort(num);
    // System.out.println(num);
     
     long sum2=0;
     
     for(int j=0;j<k;j++){
      sum = sum-num.get(j);
      sum2=sum2+num.get(j);
     }
     
     System.out.println(Math.abs(sum-sum2));
    }
  }
  
}
