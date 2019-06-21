import java.util.*;
import java.math.*;
class BUYING2 {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    for(int i=0;i<testcases;i++){
     int n = in.nextInt();
     int x = in.nextInt();
     int[] notes = new int[n];
     int sum = 0;
     
     for(int j=0;j<n;j++){
       notes[j] = in.nextInt();
       sum = sum+notes[j];
     }
     
     //System.out.println("n="+n+" x = "+x);
     int numberOfSweets = sum/x;
     int sweetCost = numberOfSweets*x;
     int diff = sum-sweetCost;
     if(diff<=0){
       System.out.println(numberOfSweets);
     }
     else{
      //diff is positive
      int j=0;
      for(j=0;j<n;j++){
        if(notes[j]<=diff){
          System.out.println("-1");
          break;
        }
      }
      if(j>=n)
        System.out.println(numberOfSweets);
     }
     
    }
  }
  
}
