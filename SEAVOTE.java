import java.util.*;
class SEAVOTE {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
  
    for(int i=0;i<testcases;i++){
      int n = in.nextInt();
      int sum = 0;
      int numberOfNonZero = 0;
      for(int j=0;j<n;j++){
        int bi = in.nextInt();
        if(bi!=0)
          numberOfNonZero++;
        sum = sum + bi;
      }
      
      if(sum==100){
       System.out.println("YES");
       continue ;
      }
      
      if(sum<100){
       System.out.println("NO");
       continue ;
      }
      
      int diff = sum-100;
      double diffByN = ((double)diff)/((double)numberOfNonZero);
      //System.out.println("Diff = "+diff+" DiffByN = "+diffByN);
      if(diffByN>=1.0)
        System.out.println("NO");
      else
        System.out.println("YES");
    }
  }
}
