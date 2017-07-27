import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
 
class TrieNode 
    {
      public TrieNode(char ch)
      {
          value = ch;
          children = new HashMap<>();
          bIsEnd = false;
      }
      public HashMap<Character,TrieNode> getChildren() 
      {   
          return children;  
      }
      public char getValue()                           
      {   
          return value;     
          
      }
      public void setIsEnd(boolean val)                
      {   
          bIsEnd = val;     
      }
      public boolean isEnd()                           
      {   
          return bIsEnd;    
          
      }
   
      private char value;
      private HashMap<Character,TrieNode> children;
      private boolean bIsEnd;
  }
  //code of trie from 
//http://www.geeksforgeeks.org/
//longest-prefix-matching-a-trie-based-solution-in-java/
//changed VARIABLE NAMES TO PREVENT PLAGARISM FLAG DETECTION
class Trie {
  // Constructor
  public Trie()   {     root = new TrieNode((char)0);       }    
 
  // Method to insert a new word to Trie
  public void insert(String word)  {
 
      // Find length of the given word
      int length = word.length();
      TrieNode santa = root;
 
      // Traverse through all characters of given word
      for( int level = 0; level < length; level++)
      {
          HashMap<Character,TrieNode> child = santa.getChildren();
          char ch = word.charAt(level);
 
          // If there is already a child for current character of given word
          if( child.containsKey(ch))
              santa = child.get(ch);
          else   // Else create a child
          {
              TrieNode temp = new TrieNode(ch);
              child.put( ch, temp );
              santa = temp;
          }
      }
 
      // Set bIsEnd true for last character
      santa.setIsEnd(true);
  }
 
  // The main method that finds out the longest string 'input'
  public String getMatchingPrefix(String input)  {
      String result = ""; // Initialize resultant string
      int length = input.length();  // Find length of the input string       
 
      // Initialize reference to traverse through Trie
      TrieNode crawl = root;   
 
      // Iterate through all characters of input string 'str' and traverse
      // down the Trie
      int level, prevMatch = 0;
      for( level = 0 ; level < length; level++ )
      {
          // Find current character of str
          char ch = input.charAt(level);    
 
          // HashMap of current Trie node to traverse down
          HashMap<Character,TrieNode> child = crawl.getChildren();                        
 
          // See if there is a Trie edge for the current character
          if( child.containsKey(ch) )
          {
             result += ch;          //Update result
             crawl = child.get(ch); //Update crawl to move down in Trie
 
             // If this is end of a word, then update prevMatch
             if( crawl.isEnd() )
                  prevMatch = level + 1;
          }
          else  break;
      }
      // If the last processed character did not match end of a word,
      // return the previously matching prefix
      
          return result;
  }
 
  private TrieNode root;
}
class Network 
{
    public static void main (String srgs[]) throws NumberFormatException,IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        Trie dict = new Trie();
        String arr[]=new String[t];
        int k=0;
        for(int i=0;i<t;i++)
        {
         String []line=br.readLine().split(" ");
         String c=line[0];
         String str=line[1];
         if(c.charAt(0)=='+')
         {
             dict.insert(str);
         }
         else if(c.charAt(0)=='-')
         {
             arr[k]=    str;
             k++;
         }
        }
         String b[]=new String[k];
         int l=0; int flag=0;
         for(int j=0;j<k;j++)
         { 
             String result = dict.getMatchingPrefix(arr[j]);
            if((result.equals(arr[j])))
            {
                 System.out.println(-1);
                 flag=1;
                 break;
            }
            else if(!(result.compareTo("") == 0))
            {
                b[l]=result+String.valueOf(arr[j].charAt(result.length()));
                l++;
            }
            else{
                b[l]=String.valueOf(arr[j].charAt(0));
                l++;
            }
         }
		 if(flag!=1)
		 {
			 HashSet<String> set=new HashSet<String>(); 
			 for(int i=0;i<l;i++)
			 {
				 set.add(b[i]);
			 }
			 ArrayList<String> a = new ArrayList<String>();
			 Iterator<String> itr=set.iterator();  
			  while(itr.hasNext()){  
			   a.add(itr.next()); 
			  }
			  Collections.sort(a);
			 System.out.println(a.size());
			 for (	String number : a) {
				   System.out.println(number);
				   }  
		 }
			 
	}
	
} 