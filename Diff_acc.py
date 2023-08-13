def diff(n,m):
    global sum,non
    for i in range(m+1):
        if i%n==0:
            sum+=i
        else:
            non+=i
    d=abs(non-sum)
    print(d)
sum=0
non=0
m=int(input())
n=int(input())
diff(n,m)