n=input()
count=0
f=""
for i in n:
    if i=='-':
        count+=1
    else:
        f+=i
print("-"*count,f)