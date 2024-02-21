

# Function which returns a string with every word having capital letter

def capitalName(s):
    ans = s.split(' ')
    ans1 = (((i.capitalize() for i in ans)))
    return ' '.join(ans1)