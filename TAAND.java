import java.util.*;
import java.math.*;
class TAAND {
  
  static String finalAnswer = "";
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<Integer> num = new ArrayList<Integer>();
   
    for(int i=0;i<n;i++){
      Integer temp = in.nextInt();
      num.add(temp);
    }
    //calculate(a,n);
    calculate(num,31);
    //System.out.println(finalAnswer);
    int decimalValue = Integer.parseInt(finalAnswer, 2);
    finalAnswer = "";
    System.out.println(decimalValue);
  }
  
  static void calculate(List<Integer> S,int index){
    if(index==0)
      return;
    
    List<Integer> startingOne = new ArrayList<Integer>();
    List<Integer> startingZero = new ArrayList<Integer>();
    int temp = 0;
    for(int i=0;i<S.size();i++){
      temp = S.get(i);
      //Check if index bit is 1
      if(((temp>>index-1)&1)==1)
        startingOne.add(temp);
      else
        startingZero.add(temp);
    }
    
    if(startingOne.size()<2){
      finalAnswer = finalAnswer+"0";
      calculate(S,index-1);
    }
    else{
      finalAnswer = finalAnswer+"1";
      calculate(startingOne,index-1);
    }
    
  }
  
  static void calculateNaive(List<Integer> a){
    if(a.size()==0||a.size()==1)
      System.out.println("0");
    else{
      int max = Integer.MIN_VALUE;
      int i=0,j=0;
      for(i=0;i<a.size();i++){
        for(j=i+1;j<a.size();j++){
         if((a.get(i)&a.get(j))> max)
           max = a.get(i)&a.get(j);
        }
      }
      System.out.println(max);
    }
  }
}
