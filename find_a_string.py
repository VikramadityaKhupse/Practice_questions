# In this challenge, the user enters a string and a substring. You have to print the number of times that the substring occurs in the given string. String traversal will take place from left to right, not from right to left.
#
# NOTE: String letters are case-sensitive.
#
# Input Format
#
# The first line of input contains the original string. The next line contains the substring.
def count_substring(string, sub_string):
    sub_length = len(sub_string)
    count = 0
    current_string_check_initial_index = 0
    current_string_check_last_index = sub_length
    while (current_string_check_last_index != len(string) + 1):
        if string[current_string_check_initial_index:current_string_check_last_index] == sub_string:
            count += 1
        current_string_check_initial_index += 1
        current_string_check_last_index += 1

    return count


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)