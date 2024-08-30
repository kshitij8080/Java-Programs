# sum of all the number in the list

def sum_nos_list(a) :
    s = 0
    for val in a :
        s = s + val
    return s

a = []
n = int (input (" Enter Limit: "))
for i in range (0, n) :
    num = int (input (" Enter numbers: "))
    a.append(num)
print (" sum of List Elements= ", sum_nos_list(a))
