from tkinter import *
def show():
    s = t1.get()
    s1 = ""
    for ch in s:
        if ch == " ":
            s1 = s1 + "*"
        elif ch >= 'A' and ch <= 'Z':
            s1 = s1 + ch.lower()
        elif ch >='a' and ch <= 'z':
            s1 = s1 + ch.upper()
        elif ch >= '0' and ch <= '9':
            s1 = s1 + "?"
    t2.insert(0, s1)
    
win = Tk()
win.geometry("400x300")
l1 = Label(win, text="Enter String:")
l1.grid(row=0, column=0)
t1 = Entry(win, width=30)
t1.grid(row=0, column=1)
l2 = Label(win, text="Result String:")
l2.grid(row=1, column=0)
t2 = Entry(win, width=30)
t2.grid(row=1, column=1)
b1 = Button(win, text="Ok", command=show)
b1.grid(row=4, column=1)

win.mainloop()