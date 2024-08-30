#count uppercase and lowercase

def count_char(s):
    c1 = 0;
    c2 = 0;
    for ch in s :
        if ch > 'A' and ch < 'Z':
            c1 = c1 + 1
        else :
            c2 = c2 + 1
    print ("UpperCase count= ",c1)
    print ("LowerCase count= ",c2)

s = input("Enter String= ")
count_char(s)
