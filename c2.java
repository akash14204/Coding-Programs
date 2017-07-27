

import java.util.*;

class B {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      
	       int n = sc.nextInt(); 
           int m = sc.nextInt();
	  
	       int a[]=new int[n+1];
			for(int j=0;j<n;j++){
			      a[j]=sc.nextInt();
			}
			
			String[] str1=new String[m+1];
			String[] str2=new String[m+1];
			int[] p1=new int[m+1];
			int[] p2=new int[m+1];
			
			int y=0;
			int z=0;
			int pp=0;
			Map<Integer, String> unsortMap = new HashMap<Integer, String>();
			Map<Integer, String> unsortMap1 = new HashMap<Integer, String>();
			for(int i=0;i<m;i++){
				pp=0;
				  int num=sc.nextInt();
				  for(int j=0;j<n;j++){
				  if(num==a[j]){ pp=1;
				  break;}
				  }
			      p1[i]=sc.nextInt();
				  str1[i]=sc.next();
				  if(pp==1){
					unsortMap.put(p1[i], str1[i]);
				  }
				  else{
					  unsortMap1.put(p1[i], str1[i]);
				  }
			}
			
	
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });
		treeMap.putAll(unsortMap);
        printMap(treeMap);
		
        Map<Integer, String> treeMap1 = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });
        treeMap1.putAll(unsortMap1);
        printMap(treeMap1);

    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}