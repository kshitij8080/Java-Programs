# check number is prime or not

def isprime(n) :
    f = 0
    for i in range (2, n) :
        if n % i == 0 :
            f = 1
            break
    if f == 0 :
        print (" Number is prime ")
    else :
        print (" number is not prime ")

n = int (input ("Enter Number: "))
isprime(n)
