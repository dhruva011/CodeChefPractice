import java.util.*;
import java.io.*;
class TWTCLOSE {
  
  
  public static void main(String[] args) throws Exception{ 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String nk = reader.readLine();
   
    String[] s = nk.split(" ");
    int n = Integer.parseInt(s[0]);
    int k = Integer.parseInt(s[1]);
    int openTweets = 0;
    int[] tweets = new int[n];
    int CLOSEALL = 0;
    
    //System.out.println("n = "+n+" k = "+k);
    while((nk = reader.readLine())!=null){
        if(nk.equals("CLOSEALL")){
             for(int j=0;j<tweets.length;j++)
                tweets[j]=0;
                openTweets=0;
                System.out.println(openTweets);
        }
        else{
        String[] num = nk.split("CLICK ");
        //System.out.println(num[1]);
        int tweetNum = Integer.parseInt(num[1]);
        if(tweets[tweetNum-1]==0){
          tweets[tweetNum-1]++;
        openTweets++;
        }
        else{
          tweets[tweetNum-1]--;
          openTweets--;
        }
         System.out.println(openTweets);
        
        }
    }
  }
  
}

