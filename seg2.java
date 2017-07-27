
/**
* For the brave souls who get this far: You are the chosen ones,
* the valiant knights of programming who toil away, without rest,
* fixing our most awful code. To you, true saviors, kings of men,
* I say this: never gonna give you up, never gonna let you down,
* never gonna run around and desert you. Never gonna make you cry,
* never gonna say goodbye. Never gonna tell a lie and hurt you.
*/


#include<stdio.h>
	int tree[3000005],a,b;
/**
* Build and init tree
*/





 int smallfactor(int C){
	 int i;
      for ( i = 2; i*i<= C; i++) {
        if (C % i == 0){
            return i;
        }
      }
    return C;
    }

int max(int nn,int mm)
{
	if(nn>mm)
		return nn;
	else
		return mm;
}



//
// Dear maintainer:
//
// Once you are done trying to 'optimize' this routine,
// and have realized what a terrible mistake that was,
// please increment the following counter as a warning
// to the next guy:
//
// total_hours_wasted_here = 42
//





void build_tree_new(int node, int a, int b, int arr[]){
if(a > b) return; //  zxfsdfsdf
if(a == b) { // sdsfdss
tree[node] = arr[a]; // frewfaefa
return;
}
build_tree_new(node*2, a, (a+b)/2,arr); // dsfdsfdsds
build_tree_new(node*2+1, 1+(a+b)/2, b,arr); // dfsafsadfdasfas
tree[node] = max(tree[node*2], tree[node*2+1]); // dsfasdfsadfdasfasfasdfasdf
}

int query_tree_new(int node, int a, int b, int i, int j) {
if(a > b || a > j || b < i) return -1; // wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
if(a >= i && b <= j) //sdfdkas;lkf;lal;dfgklaklf;ka;dfka
return tree[node];
int q1 = query_tree_new(node*2, a, (a+b)/2, i, j); // wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
int q2 = query_tree_new(1+node*2, 1+(a+b)/2, b, i, j); // wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
int res = max(q1, q2); // wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
return res;
}



// At this point, I'd like to take a moment to speak to you about the Adobe PSD
// format. PSD is not a good format. PSD is not even a bad format. Calling it
// such would be an insult to other bad formats, such as PCX or JPEG. No, PSD
// is an abysmal format. Having worked on this code for several weeks now, my
// hate for PSD has grown to a raging fire that burns with the fierce passion
// of a million suns.
//
// If there are two different ways of doing something, PSD will do both, in
// different places. It will then make up three more ways no sane human would
// think of, and do those too. PSD makes inconsistency an art form. Why, for
// instance, did it suddenly decide that *these* particular chunks should be
// aligned to four bytes, and that this alignement should *not* be included in
// the size? Other chunks in other places are either unaligned, or aligned with
// the alignment included in the size. Here, though, it is not included. Either
// one of these three behaviours would be fine. A sane format would pick one.
// PSD, of course, uses all three, and more.
//
// Trying to get data out of a PSD file is like trying to find something in the
// attic of your eccentric old uncle who died in a freak freshwater shark
// attack on his 58th birthday. That last detail may not be important for the
// purposes of the simile, but at this point I am spending a lot of time
// imagining amusing fates for the people responsible for this Rube Goldberg of
// a file format.
//
// Earlier, I tried to get a hold of the latest specs for the PSD file format.
// To do this, I had to apply to them for permission to apply to them to have
// them consider sending me this sacred tome. This would have involved faxing
// them a copy of some document or other, probably signed in blood. I can only
// imagine that they make this process so difficult because they are intensely
// ashamed of having created this abomination. I was naturally not gullible
// enough to go through with this procedure, but if I had done so, I would have
// printed out every single page of the spec, and set them all on fire. Were it
// within my power, I would gather every single copy of those specs, and launch
// them on a spaceship directly into the sun.
//
// PSD is not my favourite file format.




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
//wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
update_tree(node*2, a, (a+b)/2, i, j); //wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
update_tree(1+node*2, 1+(a+b)/2, b, i, j); // wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
tree[node] = max(tree[node*2], tree[node*2+1]); // wenlkwmdmaslmflmsadfmmaskdlmflsanflmskadf
}

}

int main(){
	int i,j,k,t,array_number,machine_number,machine_value,l,r;
	int q=0;
int z;
   scanf("%d",&t);
  while(t-->0){
			scanf("%d",&array_number);
			scanf("%d",&machine_number);

		    int arr[array_number+1];
			int last_answer[machine_number+1];

			for(i=1;i<=array_number;i++){

				scanf("%d",&arr[i]);

				/*for( z=2; z<=arr[i]/2; ++z){
					if(q==0){
                 // condition for nonprime number
                  if(arr[i]%z==0){
                  q++;
                  break;
                  }
				}*/
				}
			}








if(array_number<=1000){
int u=0;
			for(i=0;i<machine_number;i++){
				 scanf("%d",&machine_value);
				 scanf("%d",&l);
                 scanf("%d",&r);

				int res=1;
				if(machine_value==0){
					for(j=l;j<=r;j++){
						arr[j]=arr[j]/(smallfactor(arr[j]));
					}
				}
				else if(machine_value==1){
					for(k=l;k<=r;k++){
						if(res<(smallfactor(arr[k]))){
							res=(smallfactor(arr[k]));
						}
					}
					last_answer[u]=res;
					u++;
				}
			}

			for(i=0;i<u;i++){
			printf("%d ",last_answer[i]);
			}

			printf("\n");
}
else{

build_tree_new(1,1,array_number,arr);
			int u=0;
			for(i=0;i<machine_number;i++){
				 scanf("%d",&machine_value);
				 scanf("%d",&a);
                 scanf("%d",&b);



				int res=1;
				if(machine_value==0){
					/*for(j=l;j<=r;j++){
						input_array[j]=input_array[j]/(smallfactor(input_array[j]));
					}*/
					update_tree(1,1,array_number,a,b);
				}
				else if(machine_value==1){
					/*for(k=l;k<=r;k++){
						if(res<(smallfactor(input_array[k]))){
							res=(smallfactor(input_array[k]));
						}
					}*/
					last_answer[u]=query_tree_new(1,1,array_number,a,b);
					u++;
				}
			}

			for(i=0;i<u;i++){
			printf("%d ",last_answer[i]);
			}

			printf("\n");



        }
  }

}
