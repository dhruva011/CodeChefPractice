import java.util.*;
class HMAPPY2 {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    for(int i=1;i<=testcases;i++){
      long n = in.nextLong();
      long a = in.nextLong();
      long b = in.nextLong();
      long k = in.nextLong();
      solve(n,a,b,k);
    }
  }
  
  static void solve(long n,long a,long b,long k){
    long divisibleByA=n/a;
    long divisibleByB=n/b;
    long divisibleByAandB = n/LCM(a,b);
    long divisibleByAorB = divisibleByA+divisibleByB-divisibleByAandB;
    long ans = (divisibleByAorB-divisibleByAandB);
    if(ans>=k)
      System.out.println("Win");
    else
      System.out.println("Lose");
  }
  
  static long LCM(long a,long b){
    long hcf = HCF(a,b);
    return (a/hcf)*b;
  }
  
  static long HCF(long a,long b){
    if (a == 0) 
        return b;  
    return HCF(b % a, a);
  }
}
