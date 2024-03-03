from datetime import datetime

# Input processing
date_str = input().strip()

# Convert input string to datetime object
date = datetime.strptime(date_str, "%m %d %Y")

# Get the day of the week
day_of_week = date.strftime("%A")

# Output the result
print(day_of_week.upper())
