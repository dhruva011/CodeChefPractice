import java.util.*;
import java.math.*;
class AND {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long[] num = new long[n];
    long[] position = new long[32];
    
    for(int i=0;i<n;i++){
     num[i] = in.nextLong(); 
     //Now count number of ones in the number at each position 
     for(int j=0;j<32;j++){
       if((num[i]&(1L<<j))!=0)
         position[j]++;
     }
     //for(int j=0;j<32;j++)
     //System.out.println("Position at index  = "+j+" count = "+position[j]);
    }
    long result = 0;
    for(int j=0;j<32;j++){
      long numberOfways = (position[j]*(position[j]-1L))/2L;
      long temp = numberOfways*(1L<<j);
      result = result+temp;
    }
    
    System.out.println(result);
    
  }
  
  
}
