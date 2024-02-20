input_string = input().split()
N = int(input_string[0])
M = int(input_string[1])
dot_line_design_count_array = [i * 2 + 1 for i in range(N // 2)]
dash_count_array = [(M - 3 * x) // 2 for x in dot_line_design_count_array]

for i in range(N):
    if i < N // 2:
        print(dash_count_array[i] * '-' + dot_line_design_count_array[i] * '.|.' + dash_count_array[i] * '-')
    elif i == N // 2:
        print(((M - 7) // 2) * '-' + 'WELCOME' + ((M - 7) // 2) * '-')
    else:
        print(dash_count_array[N // 2 - i] * '-' + dot_line_design_count_array[N // 2 - i] * '.|.' + dash_count_array[
            N // 2 - i] * '-')

# print(dash_count_array)
# print(N//2)
# print(dot_line_design_count_array)

