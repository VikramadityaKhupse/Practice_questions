import textwrap


def wrap(string, max_width):
    wrapped_string = ""
    starting_index = 0
    ending_index = max_width
    while len(string) - starting_index >= max_width:
        wrapped_string += '\n' + string[starting_index:ending_index]
        starting_index += max_width
        ending_index += max_width

    wrapped_string += '\n' + string[starting_index:]

    return wrapped_string


print(wrap("ABCDEFGHIKL", 2))


# OPTIMIZED VERSION
# def wrap(string, max_width):
#     wrapped_lines = []
#     for i in range(0, len(string), max_width):
#         wrapped_lines.append(string[i:i+max_width])
#     return '\n'.join(wrapped_lines)

