import java.util.*;
class A{
	static int[] tree=new int[3000005];
/**
* Build and init tree
*/
int max(int nn,int mm)
{
	if(nn>mm)
		return nn;
	else
		return mm;
}
void build_tree(int node, int a, int b,int[] arr){
if(a > b) return; // Out of range
if(a == b) { // Leaf node
tree[node] = arr[a]; // Init value
return;
}
build_tree(node*2, a, (a+b)/2,arr); // Init left child
build_tree(node*2+1, 1+(a+b)/2, b,arr); // Init right child
tree[node] = max(tree[node*2], tree[node*2+1]); // Init root value
}

int query_tree(int node, int a, int b, int i, int j) {
if(a > b || a > j || b < i) return -1; // Out of range
if(a >= i && b <= j) // Current segment is totally within range [i, j]
return tree[node];
int q1 = query_tree(node*2, a, (a+b)/2, i, j); // Query left child
int q2 = query_tree(1+node*2, 1+(a+b)/2, b, i, j); // Query right child
int res = max(q1, q2); // Return final result
return res;
}


/**
* Increment elements within range [i, j] with value value
*/
void update_tree(int node, int a, int b, int i, int j) {

if(a > b || a > j || b < i) // Current segment is not within range [i, j]
	return ;
if(tree[node]==1)
	return ;
if(a==b) { // Segment is fully within range
tree[node] =1;
return;
}
else{
//System.out.println("node="+node);
update_tree(node*2, a, (a+b)/2, i, j); // Updating left child
update_tree(1+node*2, 1+(a+b)/2, b, i, j); // Updating right child
tree[node] = max(tree[node*2], tree[node*2+1]); // Updating root with max value
}

}

public static void main(String args[]){
	Scanner in=new Scanner(System.in);
		//TEST CASES
		int t=in.nextInt();
		
		while(t-->0){
			//Array numbers and machine numbers
			int an=in.nextInt();
			int mn=in.nextInt();
			
		    int[] arr=new int[an+1];
			int[] answer=new int[mn+1];
			
			//Storing value in Array
			for(int i=1;i<=an;i++){
				arr[i]=in.nextInt();
			}
			 A ob=new A();
			ob.build_tree(1,1,an,arr);
			/*System.out.println("hello");
			for(int i=0;i<15;i++)
				System.out.print(""+tree[i]+" ");*/
			
			int u=0;
			//Storing value Machine name and arguments
			for(int i=0;i<mn;i++){
				//Machine and L and R arguments
				int mv=in.nextInt();
				int a=in.nextInt();//left index
                int b=in.nextInt();//right index
				
				//z contains smallest prime number	
	               
	               
				int res=1;
				if(mv==0){	
					/*for(int j=l;j<=r;j++){
						arr[j]=arr[j]/(ob.smallestFactor(arr[j]));
					}*/
					ob.update_tree(1,1,an,a,b);
					/*System.out.println("hello");
					for(int j=0;j<15;j++)
						System.out.print(""+tree[j]+" ");*/
				}
				else if(mv==1){	
					/*for(int k=l;k<=r;k++){
						res = Math.max(res,(ob.smallestFactor(arr[k])));
					}*/
					answer[u]=ob.query_tree(1,1,an,a,b);
					u++;
				}  				
			}
			
			for(int i=0;i<u;i++){
			System.out.print(answer[i]+" ");
			
			}
			System.out.println();
        }
    }
}