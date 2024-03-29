import pandas as pd
import re
from nltk.corpus import stopwords
from nltk.stem import SnowballStemmer

# Data Preprocessing
stemmer = SnowballStemmer("english")
stopwords_set = set(stopwords.words("english"))

df = pd.read_csv("twitter_data.csv")
print(f"Before cleaning \n{df[59:70]}")

def cleandata(text):
    # removes RT from all text
    text = re.sub(r'\sRT\s', '', text)

    # removes exclamation marks
    text = text.lower()
    text = re.sub(r'&#\d+', '', text)
    text = re.sub(r'[!:.\"\']', '', text)
    text = re.sub(r"(@[A-Za-z0-9]+)|([^0-9A-Za-z \t])|(\w+:\/\/\S+)|^rt|http.+?", "", text)
    text = [stemmer.stem(word) for word in text.split() if word not in stopwords_set]  # Stemming and remove stopwords
    return ' '.join(text)


df['tweet'] = df['tweet'].apply(cleandata)
df.dropna(subset=['tweet'], inplace=True)
df.to_csv("cleaned_dataset.csv", index=False)
print(f"After cleaning \n{df[59:70]}")
