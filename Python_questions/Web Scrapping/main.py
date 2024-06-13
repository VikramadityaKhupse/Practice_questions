class Person:
    species = 'Human'

    def __init__(self, name: str, age: int, height: int):
        self.name = name
        self.age = age
        self.height = height

    def __str__(self):
        return f"{self.name} is {self.age} years old!"

    def __len__(self):
        return self.height

    def __del__(self):
        print("Deleted")

if __name__ == "__main__":
    person = Person("Vikramaditya", 20, 176)
    person.species = 'Man'
    print(person.species)
    print(len(person))
    del person
    print(person)
