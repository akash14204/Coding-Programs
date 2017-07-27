import java.util.*;
class millionare
{
    public static void main(String fsaf[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String ans=sc.next();
            String chef=sc.next();
            long w[]=new long[n+1];
            for(int i=0;i<=n;i++)
            {
                w[i]=sc.nextLong();
            }
            long max=w[0];
            int c=0;
            for(int i=0;i<n;i++)
            {
                if(ans.charAt(i)==chef.charAt(i))
                {
                    c++;
                }
            }
            //int max=a[0];
            if(c==n)
                max=w[n];
            else
                for(int i=0;i<=c;i++)
                {
                    if(w[i]>max)
                        max=w[i];
                }
 
            
            System.out.println(max);
        }
    }
} 