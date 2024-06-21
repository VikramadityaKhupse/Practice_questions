import requests
import bs4

# getting info of a page by sending a request
result = requests.get("https://en.wikipedia.org/wiki/Main_Page")

# using soup for selecting a specific item of a website
soup = bs4.BeautifulSoup(result.text, "lxml")

# soup is an object which contains list of all data with selected tag .i.e. img here

# to save an image, we pass that image url in new request
image = requests.get("https:" + soup.select('img.mw-file-element')[0]['src'])
# print(image.content)

# to download image in device we will save binary content (image.content) in a jpg or png file
f = open('masai_giraffe_pic.jpg', 'wb')  # wb = write binary
f.write(image.content)
f.close()
