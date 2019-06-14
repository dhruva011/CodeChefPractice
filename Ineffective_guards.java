import java.util.*;
import java.math.*;

class Ineffective_guards{
   static int n,m;
   static long[][] gaurds; 
   static long[][] jewel; 
   static boolean[][] matrix;
  static void setInput(){
    n=3;
    m=3;
    gaurds = new long[n][2];
    jewel = new long[m][3];
    matrix = new boolean[n][m];
    gaurds[0][0]=-1;gaurds[0][1]=-1;
    gaurds[1][0]=-3;gaurds[1][1]=-1;
    gaurds[2][0]=-100;gaurds[2][1]=-150;
    
    jewel[0][0]=0;jewel[0][1]=0;
    jewel[1][0]=-2;jewel[1][1]=0;
    jewel[2][0]=-94;jewel[2][1]=-145;
  }
  
  static void takeUserInput(){
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int m = in.nextInt();
   matrix = new boolean[n][m];
   
   
   for(int i=0;i<n;i++){
    gaurds[i][0] = in.nextLong();
    gaurds[i][1] = in.nextLong();
   }
   
   for(int i=0;i<m;i++){
    jewel[i][0] = in.nextLong();
    jewel[i][1] = in.nextLong();
    
   }
   in.close();
  }
  
  public static void main(String [] args){
   setInput();
   //printGaurdsAndJewel(gaurds,jewel,n,m);
   calculate(gaurds,jewel,n,m);
   printMatrix();
  }
  
  static void calculate(long[][] gaurds,long[][] jewel,int n,int m){
  //Iterate through each gaurd
    for(int i=0;i<n;i++){
     //gaurds[i][0] are the cordinate (Xi,Yi)
      //Iterate through each Jewel
      for(int j=0;j<m;j++){
        boolean isVisible = isJewelVisible(gaurds[i][0],gaurds[i][1],jewel[j][0],jewel[j][1]);
        if(isVisible==true)
          matrix[i][j] = true;
        System.out.println("Gaurds cordinates = "+gaurds[i][0]+","+gaurds[i][1]+ " and Jewel Cordinate = "+jewel[j][0]+","+jewel[j][1]+" and visible = "+isVisible);
      }
    }
  
  }
  
  static boolean isJewelVisible(long xi,long yi,long xi_,long yi_){
   long t1 = Math.abs(yi - yi_);
   long t2 = (xi_ - xi);
     if(t1<=t2)
     return true;
   return false;
  }
  
  static void printGaurdsAndJewel(long[][] gaurds,long[][] jewel,int n,int m){
    System.out.println("printing the cordinates of gaurds..");
    for(int i=0;i<n;i++){
      System.out.println(gaurds[i][0]+" "+gaurds[i][1] );
    }
    System.out.println("printing the cordinates of jewels..");
    for(int i=0;i<m;i++){
      System.out.println(jewel[i][0]+" "+jewel[i][1] +" "+jewel[i][2]);
   }
  }
  
  static void printMatrix(){
    System.out.println("printing the matrix..");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++)
      System.out.print(matrix[i][j]+" ");
      System.out.println(" ");
    }
  }
  
  
}