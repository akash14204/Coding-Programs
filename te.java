import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
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
 //simple input

class A{
	public static void main(String args[])throws NumberFormatException,IOException{
	
		
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
		Trie dict = new Trie();
		int t=Integer.parseInt(br.readLine());
		String s[]=new String[t+1];
		String str[]=new String[t+1];
		int k=0;
		for(int i=0;i<t;i++){	
		  String str1[]=br.readLine().split(" ");
		  //str1[0]
		  //str1[1]
			if(str1[0].equals("+")){
				dict.insert(str1[1]);
				//System.out.println("ADDED");
			}
			else{
				str[k]=str1[1];
				k++;
				//System.out.println("NO");
			}
		}
		
		int z=0;
		int flag=0;
		for(int i=0;i<k;i++){
				String p=dict.getMatchingPrefix(str[i]);
				//System.out.println(p);
				//System.out.println(p.length());
				//System.out.println(str[i].charAt(p.length()));
                if(p.length()<str[i].length()){
					s[z]=dict.getMatchingPrefix(str[i])+""+str[i].charAt(p.length());
                    z++;
				}
				else{
					System.out.println("-1");
					flag=1;
					break;
					
				}
		}
		if(flag!=1){
		Map<String, String> unsortMap = new HashMap<String, String>();
		for(int i=0;i<z;i++){
			//System.out.println(s[i]);
			unsortMap.put(s[i], ""+i);
		}
	    Map<String, String> treeMap = new TreeMap<String, String>(unsortMap);
		if(unsortMap.size()==0){
		   System.out.println("-1");
		}
		else{
			System.out.println(unsortMap.size());
		}
        printMap(treeMap);
		}
	   
	}
	 //pretty print a map
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
	
}