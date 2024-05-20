package END_TERM;
// Interface
public interface Animal {
    void sound(); // Method signature
    void walk();
    int legsCount = 0;

}

interface Snakes{

    void swim();
void colour();

int CONSTANT = 0;
}

interface Birds extends Snakes {
void feather();
void legs();

}

// Class implementing interface
class Dog implements Animal, Birds {
    
    @Override
    public void sound() {
        System.out.println("Woof");
        
        
    }

    int legsCount = 100;

    @Override
    public void walk(){
        System.out.println(legsCount);

    }
    public void feather(){}
    public void legs(){}
    public void swim(){}
public void colour(){}


}

abstract class Cat implements Animal {
    




}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Woof
        dog.walk();
        Cat cat = new Cat();
        cat.sound(); // Output: Meow
    }
}

abstract class Child extends Cat{

    
}
