# Program to make a simple
# login screen


import tkinter as tk

root = tk.Tk()

# setting the windows size
root.geometry("600x400")

# declaring string variable
# for storing name and password
user_text = tk.StringVar()


# defining a function that will
# get the name and password and
# print them on the screen
def submit():
    name = user_text.get()

    print("The name is : " + name)

    user_text.set("")


# creating a label for
# name using widget Label
name_label = tk.Label(root, text='Enter text', font=('calibre', 10, 'bold'))

# creating a entry for input
# name using widget Entry
name_entry = tk.Entry(root, textvariable=user_text, font=('calibre', 10, 'normal'))

# creating a button using the widget
# Button that will call the submit function
sub_btn = tk.Button(root, text='Submit', command=submit)

# placing the label and entry in
# the required position using grid
# method
name_label.grid(row=0, column=0)
name_entry.grid(row=0, column=1)

sub_btn.grid(row=2, column=1)

# performing an infinite loop
# for the window to display
root.mainloop()
