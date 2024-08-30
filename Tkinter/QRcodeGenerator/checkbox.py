from tkinter import *
from tkinter import messagebox

def show():
    s = ""
    if val1.get() == 1:
        s = "java"
    if val2.get() == 1:
        s = s + " php"
    if val3.get() == 1:
        s = s + " python"
        
    messagebox.showinfo("subjects", s)

win = Tk()
win.geometry("500x500")
val1 = IntVar()
val2 = IntVar()
val3 = IntVar()
c1 = Checkbutton(win, text="java", variable=val1,)
c2 = Checkbutton(win, text="php", variable=val2,)
c3 = Checkbutton(win, text="python", variable=val3,)
b1 = Button(win, text="Ok", command=show)
c1.grid(row=0, column=0)
c2.grid(row=0, column=1)
c3.grid(row=0, column=2)
b1.grid(row=1, column=1)

win.mainloop()
