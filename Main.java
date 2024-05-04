// Interface
interface Animal {
    void sound(); // Method signature
}

// Class implementing interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Woof
        
        Cat cat = new Cat();
        cat.sound(); // Output: Meow
    }
}
