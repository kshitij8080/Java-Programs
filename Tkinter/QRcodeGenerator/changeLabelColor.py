from tkinter import *

def show1():
    l1.config(bg = "red")
def show2():
    l1.config(bg = "pink")
def show3():
    l1.config(bg = "green")

obj = Tk()
obj.geometry("400x300")
l1 = Label(obj, text="Welcome", font=20)
r1 = Radiobutton(obj, text="red", value = 1, command=show1)
r2 = Radiobutton(obj, text="pink", value = 2, command=show2)
r3 = Radiobutton(obj, text="green", value = 3, command=show3)

l1.place(x = 160, y = 50)
r1.place(x = 100, y = 100)
r2.place(x = 170, y = 100)
r3.place(x = 240, y = 100)
obj.mainloop()