class Animal {

    String name;

    Animal(){
        name = "Animal";
    }
    Animal(String name){
        this.name = name;
    }

    public void walk(){

        System.out.println(name + " is walking!");
    }

    public static void main(String[] args) {
        Cat cat1  = new Cat();
        Cat cat2 = new Cat("Spicy");
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Don");

        cat1.walk();
        cat2.meow();
        dog1.walk();
        dog2.Bark();
        
    }
    
}

class Cat extends Animal{

    Cat(){

        name = "Cat";
    }

    Cat(String name){

        this.name = name;
    }

    public void meow(){

        System.out.println(name + " is meowing!");
    }

}

class Dog extends Animal{

    Dog(){

        name = "Dog";
    }

    Dog(String name){

        this.name = name;
    }

    public void Bark(){

        System.out.println(name + "is barking!");
    }

}


