# [ expression-involving-loop-variables for outer-loop-variable in outer-sequence for inner-loop-variable in
# inner-sequence ]
print([[x, y] for x in [1, 2, 3] for y in [4, 5, 6]])
# [ expression-involving-loop-variable for loop-variable in sequence ]
print([x for x in range(10)])
# [ expression-involving-loop-variable for loop-variable in sequence if boolean-expression-involving-loop-variable ]
print([x for x in range(10) if x % 3 == 0])  # Multiples of 3 below 10
