import java.util.*;
class PROXYC {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    for(int i=0;i<testcases;i++){
     int d = in.nextInt();
     String s = in.next();
     char[] c = s.toCharArray();
     solve(c,d);
    }
  }
  
  static void solve(char[] c,int size){
   
   int numberOfPresent = numberOfPresent(c,size);
   double percent = ((double)numberOfPresent/(double)size)*100.0;
   int newNumberOfPresent = numberOfPresent;
   //System.out.println("Actual Present = "+numberOfPresent);
   //System.out.println("Actual Percentage = "+percent);
   if(percent>=75.0){
     System.out.println("0");
     return ;
   }
     
   int i=0;
  
   for(i=2;i<=(size-3);i++){
     //System.out.println("Loop...."+i);
     if(c[i]=='A'){
       if((c[i-1]=='P' || c[i-2]=='P') && (c[i+1]=='P' || c[i+2]=='P')){
        newNumberOfPresent++;
        if((((double)newNumberOfPresent/(double)size)*100.0)>=75.0)
          break;
       }
     }
   }
   
   //System.out.println("New Number of Present = "+newNumberOfPresent);
   
   if(i>(size-3))
     System.out.println("-1");
   else
     System.out.println(newNumberOfPresent-numberOfPresent);
  }
  
  static int numberOfPresent(char[] c,int size){
    int count=0;
    for(int i=0;i<size;i++)
    {
     if(c[i]=='P')
       count++;
    }
    return count;
  }
}
