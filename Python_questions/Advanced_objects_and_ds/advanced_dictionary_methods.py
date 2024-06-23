d = {'one': 1, 'two': 2}
d2 = {x: x ** 2 for x in range(5)}
d3 = {k: v for k, v in zip(['a', 'b'], range(3))}
print(d, d2, d3)

for k in d.keys():
    print(k)

for v in d.values():
    print(v)
