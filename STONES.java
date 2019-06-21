import java.util.*;
class STONES {
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int testcases = in.nextInt();
    
    for(int i=0;i<testcases;i++){
    String j = in.next();
    String s = in.next();
    
    char[] jc = j.toCharArray();
    char[] sc = s.toCharArray();
    
    //System.out.println("J = "+j+" S = "+s);
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    
    for(int k=0;k<jc.length;k++){
      map.put(jc[k],0);
    }
    
    //System.out.println(map+"");
    int count = 0;
    for(int k=0;k<sc.length;k++){
      if(map.get(sc[k])!=null)
        count++;
    }
    
    System.out.println(count);
    
    }
    
  }
  
  
}
