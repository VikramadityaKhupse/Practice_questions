import re

def clean_text(text):
    # Remove URLs
    text = re.sub(r'https?://\S+|www\.\S+', '', text)
    # Remove usernames
    text = re.sub(r'@[^\s]+', '', text)
    # Remove special characters
    text = re.sub(r'[^a-zA-Z\s]', '', text)
    # Convert to lowercase
    text = text.lower()
    # Remove extra whitespace
    text = re.sub(r'\s+', ' ', text).strip()
    return text

# Sample text data
texts = [
    "!!! RT @mayasolovely: As a woman you shouldn't complain about cleaning up your house. &amp",
    "!!!!! RT @mleew17: boy dats cold...tyga dwn bad for cuffin dat hoe in the 1st place!!",
    "!!! RT @mayasolovely: As a woman you shouldn't complain about cleaning up your house. &amp",
    "!!!!!!!!!!!!!!!!!!\"@T_Madison_x: The shit just blows me..claim you so faithful and down for somebody but still fucking with hoes! &#128514;&#128514;&#128514;",
    "\" fuck no that bitch dont even suck dick \" &#128514;&#128514;&#128514; the Kermit videos bout to fuck IG up"
    # Add more texts here...
]

# Clean the sample text data
cleaned_texts = [clean_text(text) for text in texts]

# Print cleaned texts
for i, text in enumerate(cleaned_texts, 1):
    print(f"Cleaned text {i}: {text}")
