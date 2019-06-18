import java.util.*;
class RSIGNS{
    static long maxIndex = 1;
    static long maxValue = 10;
     public static void main(String []args){
     /* Scanner in = new Scanner(System.in);
       int testcases = in.nextInt();
       for(int i=0;i<testcases;i++){
         long k = in.nextLong();
         if(k<=1000000)
           getValue(k);
         else
           calculateHigherOrder(k);
       }  */
      // calculateHigherOrder(10000000); 
       getValue(1000000);
       createMap();
     }
     
     static void createMap(){
       long value = 175210288;
       Map<Long,Long> map = new HashMap<Long,Long>();
       
       for(long i=1000001;i<=1000000000;i++){
         value = ((2*(value%1000000007))%1000000007);
         if(i%10000000==0){
           System.out.println("i= "+i);
           map.put(i,value);
         }
       }
       System.out.println(map);
     }
     
     static void calculateHigherOrder(long k){
       
     }
     
     static void getValue(long k){
        long value;
        if(k==maxIndex)
        {
          System.out.println(maxValue);
          return;
        }
        if(k>maxIndex){
           value = maxValue;
           long i= 0;
           for( i=maxIndex+1;i<=k;i++){
              //System.out.println("i="+i);
              value = ((2*(value%1000000007))%1000000007);
            }
            maxIndex=i-1;
            maxValue=value;
            System.out.println(value);
            return;
          }     
        if(k<maxIndex){
            long i= 0;
            value=10;
            for(i=2;i<=k;i++){
              value = ((2*(value%1000000007))%1000000007);
            }
            System.out.println(value);
        }
         
     }
}