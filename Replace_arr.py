n=list(input())
a=input()
b=input()
for i in range(len(n)):
    if n[i]==a:
        n[i]=b
    elif n[i]==b:
        n[i]=a
for i in n:
    print(i,end="")
