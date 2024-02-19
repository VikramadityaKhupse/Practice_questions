# You are given a string and your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa

def swap_case(s):
    swapped_string = ""
    for char in s:
        if char.isupper():
            swapped_string += char.lower()
        else:
            swapped_string += char.upper()
    return swapped_string



print(swap_case("I am Phantom"))
