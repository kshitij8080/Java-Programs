from tkinter import *
def num_to_words():
    n = t1.get()
    d = {"0" : "zero", "1" : "one", "2" : "two", "3" : "three", "4" : "four", "5" : "five", "6" : "six", "7" : "seven", "8" : "eight", "9" : "nine"}
    s1 = ""
    for digit in n:
        s1 = s1 + " "+d[digit]
    t2.insert(0, s1)
    
win = Tk()
win.geometry("400x300")
l1 = Label(win, text="Enter number:")
l1.grid(row=0, column=0)
t1 = Entry(win, width=30)
t1.grid(row=0, column=1)
l2 = Label(win, text="Number in words:")
l2.grid(row=1, column=0)
t2 = Entry(win, width=30)
t2.grid(row=1, column=1)
b1 = Button(win, text="Ok", command=num_to_words)
b1.grid(row=4, column=1)

win.mainloop()