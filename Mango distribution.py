def fact(k):
    fact=1
    for i in range(1,k+1):
        fact=fact*i
    return fact
m=int(input())
n=int(input())

a=fact((m+n-1))     
b=fact((n-1))
c=fact(m)
ans=a//(b*c)
print(ans)