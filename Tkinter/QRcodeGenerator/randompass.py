from tkinter import *
from random import *
from string import *

def show():
    pas = ""
    for i in range(0, 8):
        pas = pas + choice(ascii_letters)
    t1.insert(0, pas)
    return

win = Tk()
win.geometry("400x300")
l1 = Label(win, text="Password")
t1 = Entry(win, width=20)
b1 = Button(win, text="Generate Password", command=show)

l1.place(x=0,y=20)
t1.place(x=70, y=20)
b1.place(x=70, y=50)

win.mainloop()