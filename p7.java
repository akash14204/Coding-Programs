import java.util.*;
 class A {
  public static void main(String[] args) {

int[] a = { 1, 2, 3, 4, 5, 6, 1, 1, 7, 7 };
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (int i : a) {
Integer count = map.get(i);
map.put(i, count != null ? count + 1 : 1);
}
int z=0;
int[] fre=new int[15];
int[] val=new int[15];
for (int key: map.keySet()) {
	
		fre[z]=map.get(key);
		val[z]=key;
	z++;
}
int i;
for(i=0;i<z;i++){
	System.out.println(val[i]+" "+fre[i]);
}
  }
}