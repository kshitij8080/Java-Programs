from tkinter import *
from tkinter import messagebox

def show():
    k = messagebox.askyesno("Alert Message", "Are you sure..?")
    if k == 1:
        messagebox.showinfo("Alert..!", "Yes..continue")
    else:
        messagebox.showerror("Alert..!", "Nothing")

win = Tk()
win.geometry("400x300")
b1 = Button(win, text="ok", command=show)
b1.grid(row=0, column=0)

win.mainloop()