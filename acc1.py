arr=[]
even=[]
odd=[]
n=int(input())
for i in range(n):
    m=int(input())
    arr.append(m)
for j in range(n):
    if j | 1==j:
        odd.append(arr[j])
    else:
        even.append(arr[j])
even=sorted(even)
odd=sorted(odd)
sum=even[-2]+odd[-2]
print(sum)

