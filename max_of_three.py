# max of three numbers

def maximum(a, b, c) :
    if a > b and a > c :
        return a
    elif b > a and b > c :
        return b
    else :
        return c

a = int (input (" Enter Number 1: "))
b = int (input (" Enter Number 2: "))
c = int (input (" Enter Number 3: "))

print (" Maximum number is : ", maximum(a, b, c))
