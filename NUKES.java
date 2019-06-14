import java.util.*;
public class NUKES {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int n = in.nextInt();
    int k = in.nextInt();
    int[] reactor = new int[k];
    calculate(a,n,k,reactor);
  }
  
  static void calculate(int a,int n,int k,int[] reactor){
    for(int i=1;i<=a;i++){
     reactor[0]++;
     fixBombording(reactor,n);
    }
    
    for(int i=0;i<k;i++)
      System.out.print(reactor[i]+" ");
  }
  
  static void fixBombording(int[] reactor,int N){
   //Will be called if reactor[index] is above than n
    int k = reactor.length;
    for(int i=0;i<k;i++){
      if(reactor[i]>N){
        reactor[i]=0;
        if(i==(k-1))
          continue;
        else
         reactor[i+1]++;
      }
      else
        break;
    }
  }
}
