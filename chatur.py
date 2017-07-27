from collections import defaultdict
from bisect import bisect_left
from sys import maxint
 
def merge(a,b,l1,l2):
 
    p = a[:]
    q = b[:]
    p.append(maxint)
    q.append(maxint)
    i = j = k = 0
    r = [0]*(l1+l2)
    
    while k<l1+l2:
        if p[i]<=q[j]:
            r[k] = p[i]
            i+=1
        else:
            r[k] = q[j]
            j+=1
        k+=1
        
    return r
 
def build_tree(cur,l,r):
    
    if l==r:
 
        tree[cur].append(li[l])
        size[cur]+=1
        return
    
    mid = l+(r-l)/2
    
    build_tree(2*cur+1,l,mid)
    build_tree(2*cur+2,mid+1,r)
    
    tree[cur] = merge(tree[2*cur+1],tree[2*cur+2],size[2*cur+1],size[2*cur+2])
    size[cur] = size[2*cur+1]+size[2*cur+2]
    
def query(cur,l,r,x,y,k):
    
    if r<x or l>y:
        return 0
    if x<=l and r<=y:
        return len(tree[cur])-bisect_left(tree[cur],k)
 
    mid = l+(r-l)/2
    return query(2*cur+1,l,mid,x,y,k) + query(2*cur+2,mid+1,r,x,y,k)
    
for _ in xrange(int(raw_input())):
    
    n,m = map(int,raw_input().split())
    arr = map(int,raw_input().split())
 
    last = arr[0]
    count = 1
    li = []
    
    for i in range(1,n):
        if arr[i]==last:
            count+=1
        else:
            li.append(count)
            count = 1
        last = arr[i]
 
    li.append(count)
 
    length = len(li)
    tree = defaultdict(list)
    size = defaultdict(int)
    build_tree(0,0,length-1)
    cum_li = [li[0]]
    
    for each in li[1:]:
        cum_li.append(cum_li[-1]+each)
    
    for i in range(m):
        
        l,r,k = map(int,raw_input().split())        
        ans = 0
        
        if r-l+1>=k:
            l-=1
            r-=1
            L = bisect_left(cum_li,l+1)
            R = bisect_left(cum_li,r+1)
            
            if min(cum_li[L],r+1)-l>=k:
                ans += 1
            L += 1
 
            if r+1>cum_li[L-1]:
                if r+1-max(cum_li[R-1],l+1)>=k:
                    ans += 1
                R -= 1
                
                ans += query(0,0,length-1,L,R,k) if l<=r else 0
        
        print ans