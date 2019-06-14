import java.util.*;
public class SEAVOTE {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
  
    for(int i=0;i<testcases;i++){
      int n = in.nextInt();
      int sum = 0;
      for(int j=0;j<n;j++){
        int ai = in.nextInt();
        sum = sum + ai;
      }
      if(sum<100){
       System.out.println("NO");
       continue ;
      }
      
      if(sum==100){
       System.out.println("YES");
       continue ;
      }
      
      if(sum>100){
       sum = sum - 100;
       if((1-sum/n)<1)
         System.out.println("YES");
       else
         System.out.println("NO");
      }
        
    }
  }
}
