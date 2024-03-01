# Input processing
m = int(input().strip())
set_m = set(map(int, input().strip().split()))
n = int(input().strip())
set_n = set(map(int, input().strip().split()))

# Compute symmetric difference and sort
symmetric_diff = sorted(set_m.symmetric_difference(set_n))

# Output the result
for num in symmetric_diff:
    print(num)
