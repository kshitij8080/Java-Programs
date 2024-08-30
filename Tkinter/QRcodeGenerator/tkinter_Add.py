from tkinter import *

def addition():
    a = t1.get()
    a = int(a)
    b = t2.get()
    b = int(b)
    c = a + b
    t3.insert(0,c)
    
    
window = Tk()
window.geometry("500x300")

l1 = Label(window, text = "Enter no")
l2 = Label(window, text = "Enter no")
l3 = Label(window, text = "Result")
t1 = Entry(window, width = "10")
t2 = Entry(window, width = "10")
t3 = Entry(window, width = "10")
b1 = Button(window, text = "Add", command = addition)

l1.grid(row=0, column=0)
l2.grid(row=1, column=0)
l3.grid(row=2, column=0)
t1.grid(row=0, column=1)
t2.grid(row=1, column=1)
t3.grid(row=2, column=1)
b1.grid(row=3, column=1)
window.mainloop()