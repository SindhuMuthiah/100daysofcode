s=list(input())
d=set(s)
cou=[]
for i in d:
    a=s.count(i)
    cou.append(a)
l=list(d)
for i in range(len(l)):
    print(l[i],cou[i],end="")
