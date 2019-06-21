import java.util.*;
class MINMAX
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  Integer testcases = in.nextInt();
  int i=0;
  for(i=0;i<testcases;i++)
  {
      int size=in.nextInt();
      TestCase obj = new TestCase(size);
      obj.size = size;
     // System.out.println(obj.size);
      for(int j=0;j<obj.size;j++)
      {
          obj.a[j] =in.nextLong();
          //System.out.print(obj.a[j]+" ");
      }
      obj.calculate();
  }
  
 }
}
class TestCase
{
    int size;
    long[] a;
    TestCase(int size)
    {
        a = new long[size];
    }
    void calculate()
    {
        //System.out.println("Minimum Element in Array is = "+findMin());
        System.out.println((Long)((a.length-1)*findMin()));
    }
    long findMin()
    {
        long min = Long.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            min = a[i];
        }
        return min;
    }
}