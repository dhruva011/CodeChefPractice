import java.util.*;
import java.math.*;
class TAAND {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    List<Integer> num = new ArrayList<Integer>();
   
    for(int i=0;i<n;i++){
      Integer temp = in.nextInt();
      if(temp!=0)
        num.add(temp);
    }
    //calculate(a,n);
    calculateNaive(num);
  }
  
  static void calculate(int[] a,int n){
   
  }
  
  static void calculateNaive(List<Integer> a){
    int max = 0;
    for(int i=0;i<a.size();i++){
      for(int j=i+1;j<a.size();j++){
        if((a.get(i)&a.get(j))>max)
          max = a.get(i)&a.get(j);
      }
    }
    System.out.println(max);
  }
}
