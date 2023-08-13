def findcount(arr,num,diff):
    global count
    for i in range(len(arr)):
        a=abs(arr[i]-num)
        if a<=diff:
            count+=1
    print(count)
count=0
arr=[]
n=int(input())
for i in range(n):
    b=int(input())
    arr.append(b)
num=int(input())
diff=int(input())
findcount(arr,num,diff)
