import java.util.*;
import java.io.*;
import java.math.*;

class FLIPCOIN {
  
  public static void main(String[] args) { 
    int N,Q;
    InputReader in = new InputReader(System.in);
    N = in.readInt();
    Q = in.readInt();
    
    int[] coinState = new int[N];
    //0 means tails
    //1 means Heads 
    SegmentTreeLazyUpdateADT segTreeObj = new SegmentTreeLazyUpdateADT(coinState);
    
    for(int i=0;i<Q;i++){
     int a = in.readInt();
     int b = in.readInt();
     int c = in.readInt();
     if(a==1)
       System.out.println(segTreeObj.query(b,c));
     else
       segTreeObj.update(b,c);
    }
  }
  
}

class SegmentTreeLazyUpdateADT{
  int[] tree;
  boolean[] lazy;
  int size;
  
  SegmentTreeLazyUpdateADT(int[] n){
    int log2 = (int)Math.ceil(Math.log(n.length)/Math.log(2));
    int power = (int)Math.pow(2,log2);
    tree = new int[2*power];
    lazy = new boolean[2*power];
    size = n.length;
    buildTree(n,tree,0,size-1,0);
  }
  
  void buildTree(int[] num,int[] tree,int start,int end,int index){
    if(start==end){
     tree[index] = num[start];
     return ;
    }
    int mid = (start+end)/2;
    buildTree(num,tree,start,mid,(index<<1)+1);
    buildTree(num,tree,mid+1,end,(index<<1)+2); 
    tree[index] = tree[(index<<1)+1]+tree[(index<<1)+2];
  }
 
  int query(int L,int R){
    return querySegTree(tree,0,size-1,L,R,0);
  }
  
  int querySegTree(int[] tree,int start,int end,int L,int R,int index){
   if(L>R)
     return 0;
   
   if(lazy[index]==true){
      if(start==end){//If it is leaf node
       tree[index]=1-tree[index];
      }
      else{//If non-leaf node
        int numberOfElement = end-start+1;
        int numberOfOnes = tree[index];
        tree[index] = numberOfElement - numberOfOnes;
        if((index<<1)+1<tree.length){
           lazy[(index<<1)+1] = !lazy[(index<<1)+1];
           lazy[(index<<1)+2] = !lazy[(index<<1)+2];
        }
      }
     lazy[index]=false;
   }
   
    if(L>end || R<start)//Case 1 Outside the boundary
      return 0;
   
    if(start>=L && end<=R) //Case 2 if either query is completely overlapped or within the query start and end reside
      return tree[index];
   
     
     int mid = (start+end)/2;
     int l = querySegTree(tree,start,mid,L,R,(index<<1)+1);
     int r = querySegTree(tree,mid+1,end,L,R,(index<<1)+2);
     return (l+r);
  }
    
  void update(int L,int R){
    updateSegTree(tree,0,size-1,L,R,0);
  }
  
  void updateSegTree(int[] tree,int start,int end,int L,int R,int index){
    //System.out.println("update is called for start="+start+" end="+end+" L="+L+" R="+R+" index="+index);
    if(L>R) 
      return;
    
    if(lazy[index]==true){
      if(start==end){//If it is leaf node
       tree[index]=1-tree[index];
      }
      else{//If non-leaf node
        int numberOfElement = end-start+1;
        int numberOfOnes = tree[index];
        tree[index] = numberOfElement - numberOfOnes;
        if((index<<1)+1<tree.length){
           lazy[(index<<1)+1] = !lazy[(index<<1)+1];
           lazy[(index<<1)+2] = !lazy[(index<<1)+2];
        }
      }
     lazy[index]=false;
    }
    
     if(L>end || R<start)//Case 1 Outside the boundary
      return ;

     if(start>=L && end<=R){ //Case 2 if either query is completely overlapped or within the query start and end reside
        int numberOfElement = end-start+1;
        int numberOfOnes = tree[index];
        tree[index] = numberOfElement - numberOfOnes;
        if(start!=end){
           if((index<<1)+1<tree.length){
           lazy[(index<<1)+1] = !lazy[(index<<1)+1];
           lazy[(index<<1)+2] = !lazy[(index<<1)+2];
          }
        }
        return;
     }
     
     int mid = (start+end)/2;
     updateSegTree(tree,start,mid,L,R,(index<<1)+1);
     updateSegTree(tree,mid+1,end,L,R,(index<<1)+2);
     tree[index]=tree[(index<<1)+1]+tree[(index<<1)+2]; 
  }
  
  public String toString(){
    printTreeGraphically(tree);
    return "";
  }  
  
  void printTreeGraphically(int[] tree){
   int size = tree.length-1;
   int internalNodes = size/2;
   int leaf = size-internalNodes;
   Stack<Integer> stack = new Stack<Integer>();
   int largestLeaf = leaf/2;
     
   while(internalNodes!=0){
     stack.push(leaf);
     leaf = leaf/2;
     internalNodes=internalNodes-leaf;
   }
   
   for(int i=0;i<=largestLeaf;i++)
     System.out.print("\t");
   System.out.println(tree[0]+"->lazy:"+lazy[0]);
   int index = 1;
   
   largestLeaf--;
   
   while(stack.isEmpty()!=true){
    int nodes = stack.pop();
    //System.out.print("Popped node = "+nodes+" and LargestLeaf = "+largestLeaf);
    
    for(int j=0;j<=largestLeaf;j++){
        System.out.print("\t");
    }
    largestLeaf-=1;
    for(int i=0;i<nodes;i++){
      System.out.print("     "+tree[index]+"->lazy:"+lazy[index]);
      index++;
    }
    System.out.println("");
   }
   
  }
  
}


 class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
 
    private int curChar;
 
    private int numChars;
 
    public InputReader(InputStream stream) {
        this.stream = stream;
    }
 
    public int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }
 
    public int readInt() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public long readLong() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9')
                throw new InputMismatchException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!isSpaceChar(c));
        return res * sgn;
    }
 
    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
}


