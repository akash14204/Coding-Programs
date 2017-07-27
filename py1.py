import sys
t =int(input())
for t in range(t ,0,-1) : 
 u,v = map(int,sys.stdin.readline().split(' '))
 n=int(u)+int(v)
 res=int((n*(n+1))/2)
 print(res+(u+1))
 
 
 
 
 
 
 
 
 