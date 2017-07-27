//simple input
import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;
class MaxBipartite{
	
	

 
    // A DFS based recursive function that returns true if a
    // matching for vertex u is possible
    boolean bpm(boolean bpGraph[][], int u, boolean seen[],int matchR[], int M,int N)
    {
        // Try every job one by one
        for (int v = 0; v < N; v++)
        {
            // If applicant u is interested in job v and v
            // is not visited
            if (bpGraph[u][v] && !seen[v])
            {
                seen[v] = true; // Mark v as visited
 
                // If job 'v' is not assigned to an applicant OR
                // previously assigned applicant for job v (which
                // is matchR[v]) has an alternate job available.
                // Since v is marked as visited in the above line,
                // matchR[v] in the following recursive call will
                // not get job 'v' again
                if (matchR[v] < 0 || bpm(bpGraph, matchR[v],seen, matchR,M,N))
                {
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }
 
    // Returns maximum number of matching from M to N
    int maxBPM(boolean bpGraph[][],int M,int N)
    {
        // An array to keep track of the applicants assigned to
        // jobs. The value of matchR[i] is the applicant number
        // assigned to job i, the value -1 indicates nobody is
        // assigned.
        int matchR[] = new int[N];
 
        // Initially all jobs are available
        for(int i=0; i<N; ++i)
            matchR[i] = -1;
 
        int result = 0; // Count of jobs assigned to applicants
        for (int u = 0; u < M; u++)
        {
            // Mark all jobs as not seen for next applicant.
            boolean seen[] =new boolean[N] ;
            for(int i=0; i<N; ++i)
                seen[i] = false;
 
            // Find if the applicant 'u' can get a job
            if (bpm(bpGraph, u, seen, matchR,M,N))
                result++;
        }
        return result;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		long t=in.nextInt();
		
		 
		while(t-->0){
			int C=in.nextInt();
			int D=in.nextInt();
			long e=in.nextLong();
			long[] c=new long[C];
			long[] d=new long[D];
			for(int i=0;i<C;i++){
				c[i]=in.nextLong();
			}
			for(int i=0;i<D;i++){
				d[i]=in.nextLong();
			}
			boolean[][] bpGraph=new boolean[C][D];
		    for(int i=0;i<C;i++){
				for(int j=0;j<D;j++){
					//System.out.println(Math.abs(c[i]-d[j])+"    "+e);
					if(Math.abs(c[i]-d[j])<=e){
						bpGraph[i][j]=true;
						//System.out.println(i+" "+j);
						//System.out.println(c[i]+" a "+d[j]);
					}
				}
			}
			for(int i=0;i<C;i++){
				for(int j=0;j<D;j++){
						System.out.print(bpGraph[i][j]+" ");
				}
				System.out.println("");
			}
			MaxBipartite m = new MaxBipartite();
            System.out.println( "Maximum number of applicants that can"+" get job is "+m.maxBPM(bpGraph,C,D));
		}
		
	}
}	
