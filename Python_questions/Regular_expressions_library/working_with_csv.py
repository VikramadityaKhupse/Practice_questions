# Code to clean a csv file of a dataset
import csv
data = open('twitter_data.csv')
csv_data = csv.reader(data)
data_lines = list(csv_data)
for line in data_lines:
    print(line[6])
