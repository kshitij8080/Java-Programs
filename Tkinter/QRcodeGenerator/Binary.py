from tkinter import *
from tkinter import messagebox

def bin_oct_hex():
    n = int(t1.get())
    b = bin(n)
    o = oct(n)
    h = hex(n)
    t2.insert(0, b)
    t3.insert(0, o)
    t4.insert(0, h)
    
win = Tk()
win.geometry("400x300")
l1 = Label(win, text="Enter number:")
l1.grid(row=0, column=0)
t1 = Entry(win, width=10)
t1.grid(row=0, column=1)
l2 = Label(win, text="Binary:")
l2.grid(row=1, column=0)
t2 = Entry(win, width=10)
t2.grid(row=1, column=1)
l3 = Label(win, text="Octal:")
l3.grid(row=2, column=0)
t3 = Entry(win, width=10)
t3.grid(row=2, column=1)
l4 = Label(win, text="HexaDecimal:")
l4.grid(row=3, column=0)
t4 = Entry(win, width=10)
t4.grid(row=3, column=1)
b1 = Button(win, text="Ok", command=bin_oct_hex)
b1.grid(row=4, column=1)

win.mainloop()