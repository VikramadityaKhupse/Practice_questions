def minion_game(string):
    # your code goes here
    n = len(string)
    comb = ((n) * (n + 1)) / 2
    count_k = 0
    count_s = 0
    count_k = sum([len(string[i:]) for i in range(len(string)) if string[i] in "AEIOU"])
    count_s = comb - count_k

    if count_s == count_k:
        print("Draw")
    elif count_s > count_k:
        print("Stuart", int(count_s))
    else:
        print("Kevin", int(count_k))


if __name__ == '__main__':
    s = input()
    minion_game(s)

#OPTIMIZED:
# def minion_game(string):
#     n = len(string)
#     count_k = 0  # Kevin's score
#     count_s = 0  # Stuart's score
#
#     for i in range(n):
#         if string[i] in "AEIOU":
#             count_k += n - i
#         else:
#             count_s += n - i
#
#     if count_s == count_k:
#         print("Draw")
#     elif count_s > count_k:
#         print("Stuart", count_s)
#     else:
#         print("Kevin", count_k)
