import java.util.*;
public class TestFinal {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long k = in.nextLong();
    long[] city = new long[n];
    List<Long> sortedCity = new ArrayList<Long>();
    for(int i=0;i<n;i++){
      city[i] = in.nextLong();
      sortedCity.add(city[i]);
    }
    Collections.sort(sortedCity);
    
    //System.out.println(sortedCity);
    if(n%2==0)
      solveEven(n,k,city,sortedCity);
    else
      solveOdd(n,k,city,sortedCity);
    
  }
 
  static void solveEven(int n,long k,long[] city,List<Long> sortedCity){
    int firstMidIndex = (n-1)/2;
    int secondMidIndex = n/2;
    
    long firstMidElement = sortedCity.get(firstMidIndex);
    long secondMidElement = sortedCity.get(secondMidIndex);
    
   // System.out.println("CAPITAL choosen is = "+firstMidElement+" And Now Finding the first occurence");
    
    int capitalIndex1 = 0;
    for(int i=0;i<=n;i++){
      if(city[i]==firstMidElement){
        capitalIndex1 = i;
        break;
      }
    }
    
   // System.out.println("Index found in Original Array = "+capitalIndex1);
    //System.out.println("Now Calculating the distance");
    
    //CAPITAL is city[capitalIndex1]
    
    long sumOfDistance = 0;
    for(int i=0;i<n;i++){
      if(city[i]>city[capitalIndex1])
        sumOfDistance = sumOfDistance+(city[i]-city[capitalIndex1]);
      else
        sumOfDistance = sumOfDistance+(city[capitalIndex1] - city[i]);
    }
   
    capitalIndex1++;
    
    if(sumOfDistance>=k){
      sumOfDistance = (sumOfDistance-k);
    }
    else{
      long diff = k-sumOfDistance;
      if(diff%2==0)
        sumOfDistance = 0;
      else
        sumOfDistance = 1;
    }
    
   // System.out.println("Sum of Distance For firstMidIndex= "+sumOfDistance);
    
    
    //System.out.println("CAPITAL choosen is = "+secondMidElement+" And Now Finding the first occurence");
    
    int capitalIndex2 = 0;
    for(int i=0;i<=n;i++){
      if(city[i]==secondMidElement){
        capitalIndex2 = i;
        break;
      }
    }
    
    //System.out.println("Index found in Original Array = "+capitalIndex2);
    //System.out.println("Now Calculating the distance");
    
    //CAPITAL is city[capitalIndex2]
    
    long sumOfDistanceSecond = 0;
    for(int i=0;i<n;i++){
      if(city[i]>city[capitalIndex2])
        sumOfDistanceSecond = sumOfDistanceSecond+(city[i]-city[capitalIndex2]);
      else
        sumOfDistanceSecond = sumOfDistanceSecond+(city[capitalIndex2] - city[i]);
    }
   
    if(sumOfDistanceSecond>=k){
      sumOfDistanceSecond = (sumOfDistanceSecond-k);
    }
    else{
      long diff = k-sumOfDistanceSecond;
      if(diff%2==0)
        sumOfDistanceSecond = 0;
      else
        sumOfDistanceSecond = 1;
    }
    
    capitalIndex2++;
    //System.out.println("Sum of Distance For secondMidIndex= "+sumOfDistanceSecond);
    
    if(sumOfDistance<sumOfDistanceSecond)
      System.out.println(capitalIndex1+" "+sumOfDistance);
    else if(sumOfDistance>sumOfDistanceSecond)
      System.out.println(capitalIndex2+" "+sumOfDistanceSecond);
    else{
      if(capitalIndex1<capitalIndex2)
        System.out.println(capitalIndex1+" "+sumOfDistance);
      else
        System.out.println(capitalIndex2+" "+sumOfDistance);
    }
    
    
  }
  
  static void solveOdd(int n,long k,long[] city,List<Long> sortedCity){
    int midIndex = n/2;
    long midElement = sortedCity.get(midIndex);
    //System.out.println("CAPITAL choosen is = "+midElement+" And Now Finding the first occurence");
    
    int capitalIndex = 0;
    for(int i=0;i<=n;i++){
      if(city[i]==midElement){
        capitalIndex = i;
        break;
      }
    }
    
   // System.out.println("Index found in Original Array = "+capitalIndex);
   // System.out.println("Now Calculating the distance");
    
    //CAPITAL is city[capitalIndex]
    
    long sumOfDistance = 0;
    for(int i=0;i<n;i++){
      if(city[i]>city[capitalIndex])
        sumOfDistance = sumOfDistance+(city[i]-city[capitalIndex]);
      else
        sumOfDistance = sumOfDistance+(city[capitalIndex] - city[i]);
    }
   
   // System.out.println("Sum of Distance = "+sumOfDistance);
    capitalIndex++;
    
    if(sumOfDistance>=k){
      System.out.println(capitalIndex+" "+(sumOfDistance-k));
    }
    else{
      long diff = k-sumOfDistance;
      if(diff%2==0)
        System.out.println(capitalIndex+" "+"0");
      else
        System.out.println(capitalIndex+" "+"1");
    }
    
    
    
  }
  
}
