def maximumOddBinaryNumber(s: str) -> str:
    zeros = [num for num in s if int(num) == 0]
    ones = [num for num in s if int(num) == 1]
    string = ""
    while len(ones)>0:
        if len(ones) > 1:
            zeros.insert(0, ones.pop())
        else:
            zeros.append(ones.pop())
    return string.join(zeros)


print(maximumOddBinaryNumber("110001"))
