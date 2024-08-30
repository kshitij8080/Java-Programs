# number is perfect or not

def isperfect(n) :
    s = 0
    for i in range (1, n) :
        if n % i == 0:
            s = s + i


    if s == n :
        print (" Number is perfect ")
    else :
        print (" Number is Not perfect ")

n = int (input (" Enter Number "))
isperfect(n)
