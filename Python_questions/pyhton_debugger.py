import pdb

x = [1, 2, 3]
y = 2
z = 3

result_one = y+z

pdb.set_trace()
result_two = x+y

# /usr/bin/python3.10 /home/vikramaditya/Desktop/Practice/Python_questions/pyhton_debugger.py
# > /home/vikramaditya/Desktop/Practice/Python_questions/pyhton_debugger.py(10)<module>()
# -> result_two = x+y
# (Pdb) x
# [1, 2, 3]
# (Pdb) y
# 2
# (Pdb) z
# 3
# (Pdb) x+y
# *** TypeError: can only concatenate list (not "int") to list
# (Pdb) y+z
# 5
# (Pdb) x+y+z
# *** TypeError: can only concatenate list (not "int") to list
# (Pdb)