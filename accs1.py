arr=[]
m=0
n=int(input())
for _ in range(n):
  a=int(input())
  arr.append(a)
for i in range(n):
  b=arr[i]
  l=0 
  s=0
  for j in range(n):
    
    
    if arr[j]!=b:
      if arr[j]>b:
        l+=arr[j]
        
      else:
        s+=arr[j]
 
  m=l*s
  print(m,end=' ')
  arr[i]=0