def binary(str):
    n=len(str)
    c=int(str[0])
    for i in range(1,n,2):
        b=str[i]
        if b=='A':
            c=c&int(str[i+1])
        elif b=='B':
            c=c|int(str[i+1])
        else:
            c=c^int(str[i+1])
    print(c)
str=input("Enter the string")
binary(str)
