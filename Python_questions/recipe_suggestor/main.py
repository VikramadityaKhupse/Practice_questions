import json
import re

file = open('dishes.json')
dishes = json.load(file)

input_ingredients = ['cumin seeds', 'yoghurt', 'chicken', 'spice']


def check_dishes():
    for dish in dishes:
        percentage = check_ingredients(dish['ingredients'], dish['required-ingredient'])

        print(f"{dish['name']}: {percentage}")


def check_ingredients(dish_ingredients, dish_required_ingredients):
    ingredient_certainty = 0

    for ingredient in input_ingredients:
        if ingredient in dish_ingredients:
            ingredient_certainty += 1

    percentage = float(ingredient_certainty) / float(len(dish_ingredients))
    return int(percentage)


check_dishes()
