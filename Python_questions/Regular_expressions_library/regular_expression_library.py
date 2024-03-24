# regular expressions library import
import re

# Sample text data
texts = [
    "My phone number is 8530292951 and insta id is @_the_vikramaditya, My phone number 2 is 1234567890"
    # Add more texts here...
]


# function that contains different re library methods to clean texts, dataset
def clean_text(text):
    # # Remove URLs
    # text = re.sub(r'https?://\S+|www\.\S+', '', text)
    # # Remove usernames
    # text = re.sub(r'@[^\s]+', '', text)
    # # Remove special characters
    # text = re.sub(r'[^a-zA-Z\s]', '', text)
    # # Convert to lowercase
    # text = text.lower()
    # # Remove extra whitespace
    # text = re.sub(r'\s+', ' ', text).strip()

    return text


# search a specific pattern in text
# pattern = "My phone"
# match = re.search(pattern, texts[0])
# matches = re.findall(pattern, texts[0])
# print(match.span())
# print(match.start())
# print(match.end())
# # finditer() returns object
# for match in re.finditer(pattern, texts[0]):
#     print(match)

#find phone number from text
phonenumber = re.search(r'\d\d\d\d\d\d\d\d\d\d', texts[0])
# instead of using too many same \d we can use quantifier
phonenumber = re.findall(r'\d{10}', texts[0])
print(phonenumber)







# # Clean the sample text data using function cleandata()
# cleaned_texts = [clean_text(text) for text in texts]
#
# # Print cleaned texts from our texts list
# for i, text in enumerate(cleaned_texts, 1):
#     print(f"Cleaned text {i}: {text}")
