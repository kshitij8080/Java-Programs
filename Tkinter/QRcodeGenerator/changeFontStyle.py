from tkinter import *

def change_font():
    l1.config(font=('C059 Roman', 20))
def change_font2():
    l1.config(font=('C059 Roman', 20, 'bold'))
def change_font3():
    l1.config(font=('C059 Roman', 20, 'italic'))

window = Tk()
window.geometry("400x300")
l1 = Label(window, text="Welcome")
c1 = Checkbutton(window, text="C059 Roman", command=change_font)
c2 = Checkbutton(window, text="BOLD", command=change_font2)
c3 = Checkbutton(window, text="Italic", command=change_font3)

l1.place(x = 150, y = 20)
c1.place(x = 30, y = 80)
c2.place(x = 140, y = 80)
c3.place(x = 190, y = 80)

window.mainloop()