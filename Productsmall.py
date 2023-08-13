def Productsmall(sum,arr,n):
    arr.sort()
    for i in range(n-1):
        if arr[i]+arr[i+1]<=sum:
            b=arr[i]*arr[i+1]
            print(b)
            break
arr=[]
n=int(input())
for i in range(n):
    h=int(input())
    arr.append(h)
sum=int(input())
Productsmall(sum,arr,n)

    

