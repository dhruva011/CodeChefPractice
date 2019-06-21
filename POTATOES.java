import java.util.*;
import java.math.*;
class POTATOES {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    while(testcases-->0){
     int x = in.nextInt();
     int y = in.nextInt();
     int z;
     int nextPrime = findNextPrime(x+y);
     System.out.println(nextPrime-(x+y));
    }
  }
    
  static int findNextPrime(int n){
    if(n==1)
      return 2;
    if(n%2==0){
     //n is even 
     n++;
     while(isPrime(n)!=true){
      n=n+2; 
     }
    }
    else{
     //n is odd
      n=n+2;
      while(isPrime(n)!=true)
        n=n+2;
    }
    return n;
  }
  
  
  static boolean isPrime(int num){
   double sqrt = Math.sqrt(num); 
   for(int i=2;i<=sqrt;i++){
     if(num%i==0)
       return false;
   }
   return true;
  }
  
}
