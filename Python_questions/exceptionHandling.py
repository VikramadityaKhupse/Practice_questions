# Enter your code here. Read input from STDIN. Print output to STDOUT
# Task
#
# You are given two values
# a and b .
# Perform integer division a / b and print
#
# .
#
# Input Format
#
# The first line contains T
# , the number of test cases.
# The next lines each contain the space separated values of and
#
# .
#
# Constraints
#
# Output Format
#
# Print the value of a/ b
# .
# In the case of ZeroDivisionError or ValueError, print the error code.
T = int(input())
for i in range(T):
    values = input()
    values_list = values.split()

    try:
        a = int(values_list[0])
        b = int(values_list[1])
        print(a // b)
    except ZeroDivisionError as e:
        print("Error Code:", e)
    except ValueError as e:
        print("Error Code:", e)



