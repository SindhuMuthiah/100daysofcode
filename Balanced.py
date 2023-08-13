def remove_from_list(oddOnes):
    for i in range(len(oddOnes)-1, -1, -1):
        if oddOnes[i] == -1:
            continue
        if oddOnes[i].isalpha():
            j = i
            while j > 0 and j != '(':
                oddOnes[j] = -1
                j -= 1
            return oddOnes

def push_to_list(oddOnes, n):
    oddOnes.append(n)
    return oddOnes

s = input()

oddOnes = []

for i in s:
    if i == ')':
        oddOnes = remove_from_list(oddOnes)
    else:
        oddOnes = push_to_list(oddOnes, i)

print(oddOnes)
print(s)

for i in range(len(s)):
    if oddOnes[i] != '(':
        print(s[i])