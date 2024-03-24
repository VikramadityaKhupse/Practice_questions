import pandas as pd
import re

df = pd.read_csv("twitter_data.csv")


def cleandata(text):
    # removes RT from all text
    text = re.sub(r'\sRT\s', '', text)

    # removes exclamation marks
    text = re.sub(r'[!:.\"\']', '', text)
    text = text.lower()
    # removes @usernames
    text = re.sub(r'@\w+', '', text)

    # removes httpo
    text = re.sub(r'http//\w+', '', text)
    text = re.sub(r'/\w+', '', text)
    # removes &#numbers
    text = re.sub(r'&#\d*', '', text)
    text = re.sub(r'rt\s', '', text)

    return text


df['tweet'] = df['tweet'].apply(cleandata)
df.dropna(subset=['tweet'], inplace=True)
df.to_csv("cleaned_dataset2.csv", index=False)
print(df[59:70])
