'''se=set()'''
arr=[]
n=int(input())
for i in range(n):
    num=input()
    arr.append(num)
'''for j in range(n):
    se.add(arr[j])'''
se=set(arr)
print(se)
k=len(se)
print(k)


    