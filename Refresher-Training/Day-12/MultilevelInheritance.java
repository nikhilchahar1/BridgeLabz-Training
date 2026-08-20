// Base class
class Animals {
    void eat() {
        System.out.println("The animal is eating.");
    }
}

// Derived class2
class Mammal extends Animals {
    void walk() {
        System.out.println("The mammal is walking.");
    }
}

// Derived class3
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("The puppy is playing.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.walk();
        p.bark();
        p.play();
    }
}