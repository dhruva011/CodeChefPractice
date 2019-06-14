import java.util.*;
import java.math.*;
/**
 * Auto Generated Java Class.
 */
class ColoringGrid {
  
  public static void main(String[] args) { 
    Scanner in  = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] cordinate = new int[n];
    for(int i=0;i<n;i++){
      cordinate[i] = in.nextInt();
    }
    
    int[] distance = new int[n];
    int temp = 0;
    int sumOfDistance = 0;
    for(int i=0;i<n;i++){
      //cordinate[i] became CAPITAL
      sumOfDistance = 0;
      for(int j=0;j<n;j++){
        if(cordinate[j]>cordinate[i])
          temp = cordinate[j]-cordinate[i];
        else
          temp = cordinate[i]-cordinate[j];
        sumOfDistance = sumOfDistance + temp;
      }
      distance[i] = sumOfDistance;
     // System.out.println("Sum of distance when A["+i+"] is CAPITAL i.e. = "+cordinate[i]+" is = "+sumOfDistance);
    }
    
    // System.out.println("Worthy Selection is at index = "+index+" with value = "+min);
    
    for(int i=0;i<n;i++){
      if(distance[i]>=k)
        distance[i] = distance[i]-k;
      else{
        if(distance[i]%2==0)
          distance[i]=0;
        else 
          distance[i]=1;
      }
    
    }
    
    
    int min = Integer.MAX_VALUE;
    int index = -1;
    for(int i=0;i<n;i++){
      if(distance[i]<min){
       index = i;
       min = distance[i];
      }
    }
    index++;
    System.out.println(index+" "+min);
   
  }
  
}
