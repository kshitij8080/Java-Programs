from tkinter import *
def add():
    t3.delete(0,"end")
    a=t1.get()
    b=t2.get()
    a=int(a)
    b=int(b)
    c=a+b
    t3.insert(0,c)
def sub():
    t3.delete(0,"end")
    a=int(t1.get())
    b=int(t2.get())
    c=a-b
    t3.insert(0,c)
def mult():
    t3.delete(0,"end")
    a=int(t1.get())
    b=int(t2.get())
    c=a*b
    t3.insert(0,c)
def div():
    t3.delete(0,"end")
    a=int(t1.get())
    b=int(t2.get())
    c=a/b
    t3.insert(0,c)

window=Tk()
window.geometry("500x300")
menubar=Menu(window)
sub_menu=Menu(menubar)
l1=Label(window,text="Enter Number 1 : ")
l2=Label(window,text="Enter Number 2 : ")
l3=Label(window,text="Result : ")
t1=Entry(window,width=10)
t2=Entry(window,width=10)
t3=Entry(window,width=10)
l1.place(x=150,y=50)
l2.place(x=150,y=100)
l3.place(x=150,y=150)
t1.place(x=250,y=50)
t2.place(x=250,y=100)
t3.place(x=250,y=150)
sub_menu.add_command(label="Addition",command=add)
sub_menu.add_command(label="Subtraction",command=sub)
sub_menu.add_command(label="Multiplition",command=mult)
sub_menu.add_command(label="Division",command=div)
menubar.add_cascade(label="Operations",menu=sub_menu)
window.config(menu=menubar)
window.mainloop()