def unique_list(a) :
    b = set (a)
    return b

a = []
n = int (input (" Enter Limit: "))
for i in range (0, n):
    val = input (" Enter elements: ")
    a.append (val)

print (" unique list= ",unique_list(a))
