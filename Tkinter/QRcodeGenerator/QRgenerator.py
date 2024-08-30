from tkinter import *
from PIL import ImageTk, Image
import qrcode


def generateQR():
    msg = t1.get()
    qr_image = qrcode.make(msg)
    qr_image.save("qr-img.jpg")
    update_image()


def update_image():
    # Load the new QR code image
    img = Image.open("qr-img.jpg")
    photo = ImageTk.PhotoImage(img)
    
    # Update the label with the new image
    i1.config(image=photo)
    i1.image = photo  # Keep a reference to avoid garbage collection


window = Tk()
window.geometry("700x400")

# Initial image setup
img = Image.new('RGB', (200, 200), color = (255, 255, 255))  # Create a blank white image initially
img.save("qr-img.jpg")  # Save it to the file
photo = ImageTk.PhotoImage(img)

l1 = Label(window, text="Enter Message or Link to generate QR code:", fg="Blue")
t1 = Entry(window, width=40)
b1 = Button(window, text="Generate", fg="white", bg="blue", command=generateQR)
i1 = Label(window, image=photo)


l1.grid(row=1, column=0)
t1.grid(row=1, column=1)
b1.grid(row=2, column=0)
i1.grid(row=4, column=1)

window.mainloop()
