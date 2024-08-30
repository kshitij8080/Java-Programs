from tkinter import *
import random
def random_password():
    s = "abcdefghijklmnopqrstuvwxyz0123456789"
    p = ""
    s1 = ""
    for i in range(0,10):
        p = p + random.choice(s)
    t1.insert(0, p)
    
win = Tk()
win.geometry("400x300")
l1 = Label(win, text="Password:")
l1.grid(row=0, column=0)
t1 = Entry(win, width=20)
t1.grid(row=0, column=1)
b1 = Button(win, text="Generate password", command=random_password)
b1.grid(row=1, column=1)

win.mainloop()