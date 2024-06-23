s1 = {1, 2, 3, 4}
s2 = {1, 2, 67}
s3 = {2, 3, 56}
print(s1.add(69))
print(s1.union(s2))
print(s1.difference(s2))
print(s1.difference_update(s2))
print(s1.intersection(s3))
s1 = {1, 2, 3, 4}
print(s1.discard(3))
