def rat(arr,n,r,u):
    if n==0:
        print(-1)
    
    
    food_needed=r*u
    house=0
    food_avail=0
    for i in range(n):

        food_avail+=arr[i]
        house+=1
        if food_avail>=food_needed:
            print(i+1)
            break
    '''if food_avail<food_needed:
        print(0)'''
n=int(input())
arr=[]
r=int(input("Enter the no of rat"))
u=int(input())
for j in range(n):
    print("Array elemnts:")
    num=int(input())
    arr.append(num)
rat(arr,n,r,u)


        


