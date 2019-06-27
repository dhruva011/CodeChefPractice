import java.util.*;
public class Test {
  
  
  public static void main(String[] args) { 
    Scanner in  = new Scanner(System.in);
    int n = in.nextInt();
    long k = in.nextLong();
    long[] cordinate = new long[n];
    List<Long> arrayList = new ArrayList<Long>();
    for(int i=0;i<n;i++){
      cordinate[i] = in.nextLong();
      arrayList.add(cordinate[i]);
    }
    
    Collections.sort(arrayList);
    
   // System.out.println(arrayList);
    
    if(n%2==1){
      int mid = n/2;
      //System.out.println("Mid Value = "+arrayList.get(mid)+ " and mid value index = "+mid);
      int index = 0;
      for(int i=0;i<n;i++){
        if(cordinate[i] ==  arrayList.get(mid)){
         index = i;
         break;
        }
      }
     
      long sumOfDistance = 0;
      long temp = 0;
      //Cordinate[index] is CAPITAL
      for(int i=0;i<n;i++){
        if(cordinate[index] > cordinate[i])
          temp = cordinate[index] - cordinate[i];
        else
          temp = cordinate[i] - cordinate[index];
        sumOfDistance = sumOfDistance + temp; 
      }
      
      if(sumOfDistance>=k)
        System.out.println((index+1)+" "+(sumOfDistance-k));
      else{
       long diff = k-sumOfDistance ; 
       if(diff%2==0)
         System.out.println((index+1)+" "+"0");
       else
         System.out.println((index+1)+" "+"1");
      }
      
    }
    else{
      int firstMid = n/2-1;
      int secondMid = n/2;
      //System.out.println("First Mid Value = "+arrayList.get(firstMid));
      //System.out.println("Second Mid Value = "+arrayList.get(secondMid));
      
      long sumOfDistance = 0;
      long temp = 0;
      //consider cordinate[firstMid] as CAPITAL
      for(int i=0;i<n;i++){
        if(arrayList.get(firstMid) > cordinate[i])
          temp = arrayList.get(firstMid) - cordinate[i];
        else
          temp = cordinate[i] - arrayList.get(firstMid);
        sumOfDistance = sumOfDistance + temp; 
      }
      
      long firstSum = 0;
      
      if(sumOfDistance>=k)
        firstSum = sumOfDistance - k;
      else{
       long diff = k-sumOfDistance ; 
       if(diff%2==0)
         firstSum=0;
       else
         firstSum=1;
      }
      
      //System.out.println("First Sum = "+firstSum+" for item  = "+arrayList.get(firstMid)+" and sumOfDistace = "+sumOfDistance);
      
      sumOfDistance = 0;
      temp = 0;
      //consider cordinate[secondMid] as CAPITAL
      for(int i=0;i<n;i++){
        if(arrayList.get(secondMid) > cordinate[i])
          temp = arrayList.get(secondMid) - cordinate[i];
        else
          temp = cordinate[i] - arrayList.get(secondMid);
        sumOfDistance = sumOfDistance + temp; 
      }
      
      long secondSum = 0;
      
      if(sumOfDistance>=k)
        secondSum = sumOfDistance - k;
      else{
       long diff = k-sumOfDistance ; 
       if(diff%2==0)
         secondSum=0;
       else
         secondSum=1;
      }
      
     // System.out.println("Second Sum = "+secondSum+" for item  = "+arrayList.get(secondMid)+" and sumOfDistace = "+sumOfDistance);
      
      if(firstSum < secondSum){
        int ju = 0;
        for(int j=0;j<n;j++){
          if(cordinate[j]==arrayList.get(firstMid)){
            ju=j;break;
          }
        }
        ju++;
        System.out.println(ju+" "+firstSum);
      }
      else if(firstSum > secondSum){
        int ju = 0;
        for(int j=0;j<n;j++){
          if(cordinate[j]==arrayList.get(secondMid)){
            ju=j;break;
          }
        }
        ju++;
        System.out.println(ju+" "+secondSum);
      }
      else{
       int firstIndex = 0;
       int secondIndex = 0;
       
        for(int j=0;j<n;j++){
          if(cordinate[j]==arrayList.get(firstMid)){
            firstIndex=j;break;
          }
        }
        firstIndex++;
        
        for(int j=0;j<n;j++){
          if(cordinate[j]==arrayList.get(secondMid)){
            secondIndex=j;break;
          }
        }
        secondIndex++;
        
        if(firstIndex<secondIndex)
          System.out.println(firstIndex+" "+secondSum);
        else
          System.out.println(secondIndex+" "+secondSum);
        
      }
      
     }
    
    }

}
