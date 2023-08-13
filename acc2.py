
num=0
c=0
#checkpass(n,l)
def checkpass(n,l):
    global c,num
    if l<4:
        return 0
    elif n[0].isdigit():
        return 0
    for i in range(l):
        if n[i]==" " or n[i]=="/":
            return 0
        elif n[i].isdigit():
            num+=1
        elif n[i]>='A' and n[i]<='Z':
            c+=1
    if c>=1 and num>=1:
        return 1
    else:
        return 0
n=input("Enter the string:")
l=len(n)
print(checkpass(n,l))

    



    
