import java.util.*;
class ERROR {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int numberOfFeedback = in.nextInt();
    for(int i=0;i<numberOfFeedback;i++){
     String s = in.next();
     
     if(s.contains("010") || s.contains("101"))
       System.out.println("Good");
     else
       System.out.println("Bad");
    }
  }
  
}
