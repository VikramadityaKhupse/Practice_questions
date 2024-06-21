import requests
import bs4
# code to scrap a multipage book website
base_url = "http://books.toscrape.com/catalogue/page-{}.html"
list_Of_two_star_books = {}

# we will loop through each page and find books with two-star ratings
for page_number in range(1, 10):
    result = requests.get(base_url.format(page_number))
    soup = bs4.BeautifulSoup(result.text, "lxml")
    products = soup.select('.product_pod')
    for book in products:
        if len(book.select('.star-rating.Two')) != 0:
            list_Of_two_star_books[book.select('a')[1]['title']] = "http://books.toscrape.com/catalogue/"+book.select('a')[1]['href']

print(list_Of_two_star_books)

