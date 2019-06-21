import java.util.*;
class LEPERMUT {
  
   public static void main(String[] args) { 
     Scanner in = new Scanner(System.in);
     int testcases = in.nextInt();
     for(int i=0;i<testcases;i++){
      int n = in.nextInt();
      int[] num = new int[n];
      
      for(int j=0;j<n;j++)
        num[j] = in.nextInt();
      
      int localInversion = numberOfLocalInversion(num,n);
      int inversion = numberOfInversion(num,n);
      
      //System.out.println("Local Inversion = "+localInversion+" Inversion = "+inversion);
      if(localInversion==inversion)
        System.out.println("YES");
      else
        System.out.println("NO");
     }
   }
   
   
   static int numberOfInversion(int[] num,int size){
     int count = 0;
     for(int i=0;i<size;i++){
       for(int j=i+1;j<size;j++){
        if(num[i]>num[j])
          count++;
       }
     }
     return count;
   }
   
   static int numberOfLocalInversion(int[] num,int size){
     int count = 0;
     for(int i=0;i<size-1;i++){
       if(num[i]>num[i+1])
         count++;
     }
     return count;
   }
}
