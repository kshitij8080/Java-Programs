from tkinter import *
from tkinter import messagebox

def show():
    s1 = val.get()
    messagebox.showinfo("class", s1)

win = Tk()
win.geometry("500x500")
val = StringVar()
r1 = Radiobutton(win, text="FY", value="FYBBACA", variable=val)
r2 = Radiobutton(win, text="SY", value="SYBBACA", variable=val)
r3 = Radiobutton(win, text="TY", value="TYBBACA", variable=val)
b1 = Button(win, text="Ok", command=show)
r1.grid(row=0, column=0)
r2.grid(row=0, column=1)
r3.grid(row=0, column=2)
b1.grid(row=1, column=1)

win.mainloop()
