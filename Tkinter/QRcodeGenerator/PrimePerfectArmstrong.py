from tkinter import *
from tkinter import messagebox

def show():
    n = t1.get()
    n = int(n)
    
    if val.get() == 1:  # Prime check
        flag = 0
        if n < 2:
            flag = 1
        else:
            for i in range(2, int((n / 2) + 1)):
                if n % i == 0:
                    flag = 1
                    break
        if flag == 1:
            messagebox.showinfo("Prime Number", "The number is not prime")
        else:
            messagebox.showinfo("Prime Number", "The number is prime")
        
    elif val.get() == 2:  # Perfect check
        Sum = 0
        for i in range(1, n):
            if n % i == 0:
                Sum += i
        if Sum == n:
            messagebox.showinfo("Perfect Number", "The number is perfect")
        else:
            messagebox.showinfo("Perfect Number", "The number is not perfect")
            
    elif val.get() == 3:
        sum = 0
        temp = n
        while temp > 0:
            digit = temp % 10
            sum += digit ** 3
            temp //= 10
        if n == sum:
            messagebox.showinfo("Armstrong Number", "The number is Armstrong")
        else:
            messagebox.showinfo("Armstrong Number", "The number is not Armstrong")


win = Tk()
win.geometry("500x300")
val = IntVar()
l1 = Label(win, text="Enter Number")
t1 = Entry(win, width="10")
r1 = Radiobutton(win, text="Prime", value=1, variable=val)
r2 = Radiobutton(win, text="Perfect", value=2, variable=val)
r3 = Radiobutton(win, text="Armstrong", value=3, variable=val)  # Placeholder for Armstrong functionality
b1 = Button(win, text="Ok", command=show)
l1.grid(row=0, column=0)
t1.grid(row=0, column=1)
r1.grid(row=1, column=0)
r2.grid(row=1, column=1)
r3.grid(row=1, column=2)
b1.grid(row=2, column=1)

win.mainloop()
