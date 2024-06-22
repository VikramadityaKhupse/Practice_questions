# working with images in python, using pillow library
# here we will merge two images to find a secret

from PIL import Image

table_image = Image.open('word_matrix.png')
mask = Image.open('mask.png')

print(table_image.size)
print(mask.size)

resized_mask_image = mask.resize(table_image.size)
resized_mask_image.putalpha(100)
table_image.paste(resized_mask_image, box=(0, 0), mask=resized_mask_image)
table_image.save('decoded_image.png')
