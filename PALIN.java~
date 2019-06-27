import java.util.*;
import java.math.*;
public class PALIN {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    
    for(int i=1;i<=testcases;i++){
      String k = in.next();
      calculate(k);
     
    }
    
  }
  
  static void calculate(String k){
    final int mid = k.length() / 2; 
    String[] parts = {k.substring(0, mid),k.substring(mid)};
    
    System.out.println(parts[0]); //first part
    System.out.println(parts[1]); //second part
    
    if(k.length()%2==0){
     //Even 
     StringBuilder s = new StringBuilder(parts[0]);
     String reverse = s.reverse().toString();
     //System.out.println("Reverse : "+reverse);
     BigInteger reverseNum = new BigInteger(reverse);
     BigInteger secondPart = new BigInteger(parts[1]);
     if(reverseNum.compareTo(secondPart)==1){
       System.out.println("Final Answer = "+parts[0]+reverseNum);
     }
     else{
       BigInteger firstPart = new BigInteger(parts[0]); 
       firstPart = firstPart.add(BigInteger.ONE);
       
       if(parts[0].length()==(firstPart+"").length){
         s = new StringBuilder(firstPart+"");
         reverse = s.reverse().toString();
         System.out.println("Final Answer = "+firstPart+reverse);
       }
       else{
        String temp =  
       }
     }
    }
    else{
     //Odd 
     
    }
  }
    
}
