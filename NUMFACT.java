import java.util.*;
public class NUMFACT {
  
  public static void main(String[] args) { 
   
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    
    for(int i=0;i<testcases;i++){
     int n = in.nextInt();
     HashMap<Integer,Integer> map  = new HashMap<Integer,Integer>();
           for(int j=0;j<n;j++){
              int a = in.nextInt(); 
              primeFactors(a,map);
           }
          printMap(map);
    }
    
  }
  
  static void printMap(Map<Integer,Integer> map){
    int answer = 1;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      //System.out.println(entry.getKey() + "/" + entry.getValue());
      answer = answer*(entry.getValue()+1);
    }
    System.out.println(answer);
  }
  
  
  static void primeFactors(int n,Map<Integer,Integer> map){
    //System.out.println("----------------------------------------");
    int powerOfTwo = 0;
    while(n%2==0){
     powerOfTwo++;
     //System.out.println("2 is a divisor of "+n);
     n=n/2; 
    }
    Integer value = map.get(2);
    
    if(powerOfTwo!=0){
    
    if(value==null)
      map.put(2,powerOfTwo);
    else
      map.put(2,value+powerOfTwo);
    }
    
    value = null;
    for(int i=3;i<=Math.sqrt(n);){
      if(n%i==0){
        //System.out.println(i+" is a divisor of "+n);
        value = map.get(i);
        if(value==null)
          map.put(i,1);
        else
          map.put(i,value+1);
        n=n/i;
      }
      else{
        i=i+2;
      }
    }
    
    value=null;
    if(n!=1){
      value = map.get(n);
        if(value==null)
          map.put(n,1);
        else
          map.put(n,value+1);
      //System.out.println(n+" is a divisor");
    }
  }
  
}
