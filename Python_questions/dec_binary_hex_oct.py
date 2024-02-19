def print_formatted(number):
    for i in range(0, number):
        oct_val = oct(i + 1)
        hex_val = str(hex(i + 1))
        bin_val = str(bin(i + 1))

        print(f"{i} {oct_val[2:]} {hex_val.upper()[2:]} {bin_val[2:]}")

    # your code goes here


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)