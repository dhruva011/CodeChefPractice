import java.util.*;
import java.math.*;
class VOTERS {
  
  
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    int num = 0;
    Integer value = null;
    
    for(int i=0;i<(n1+n2+n3);i++){
      num = in.nextInt();
      value = map.get(num);
      if(value==null)
        map.put(num,1);
      else
        map.put(num,value+1);
    }
     
    Iterator it = map.entrySet().iterator();
    List<Integer> list = new ArrayList<Integer>();
    
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        if(Integer.parseInt(pair.getValue()+"")>=2)
        list.add(Integer.parseInt(pair.getKey()+""));
    }
    Collections.sort(list);
    System.out.println(list.size());
    
    Iterator<Integer> itr = list.iterator();
    while(itr.hasNext()){
     System.out.println(itr.next()); 
    }
  }
  
}
