def largersmall(arr):
    global even,odd
    for i in range(len(arr)):
        if ((i+1)%2)==0:
            even.append(arr[i])
        else:
            odd.append(arr[i])
    even.sort()
    odd.sort()
    print(even[-2]+odd[1])
n=int(input())
arr=[]
even=[]
odd=[]
for i in range(n):
    a=int(input())
    arr.append(a)
largersmall(arr)

    