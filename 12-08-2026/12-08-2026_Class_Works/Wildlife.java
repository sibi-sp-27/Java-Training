package javatrain;

abstract class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {

    @Override
    void sound() {
        System.out.println("Moos");
    }
}

public class Wildlife {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.eat();
        dog.sound();

        cat.eat();
        cat.sound();

        cow.eat();
        cow.sound();
    }
}