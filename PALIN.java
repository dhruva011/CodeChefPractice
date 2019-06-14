import java.util.*;
import java.math.*;
public class PALIN {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    
    for(int i=1;i<=testcases;i++){
      String s = in.next();
      char[] a = s.toCharArray();
      
      if(s.length()%2==0)
        calculateEven(a,s.length());
      else
        calculateOdd(a,s.length());
    }
    
  }
  
  static void calculateOdd(char[] a,int size){
    if(isPalindrome(a,size))
      findNextPalindrome(a,size);
    printCharArray(a,size);
  }
  
  static void findNextPalindrome(char[] a,int size){
     if(size%2==1)//odd
     {
      int mid = size/2;
      if(a[mid]!='9')
        a[mid]++;
      else{
        //Add one to 
      }
     }
  }
  
  static boolean isPalindrome(char[] a,int size){
   int mid = size/2;
   for(int i=mid;i<size;i++){
    if(a[i]!=a[size-i-1]) 
      return false;
   }
   return true;
  }
  
  static void printCharArray(char[] a,int size){
   for(int i=0;i<size;i++)
     System.out.print(a[i]);
  }
  
  
  static void calculateEven(char[] a,int size){
   for(int i=0;i<size;i++)
     System.out.println(a[i]);
  }
    
}
