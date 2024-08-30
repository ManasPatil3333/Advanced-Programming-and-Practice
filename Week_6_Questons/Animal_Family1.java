// Base class
class Animal {
    String name;
    String sound;
    int num_legs;

    public Animal(String name, String sound, int num_legs) {
        this.name = name;
        this.sound = sound;
        this.num_legs = num_legs;
    }

    public void make_sound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    public void walk() {
        System.out.println(name + " walks on " + num_legs + " legs.");
    }
}

// Derived class Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name, "barks", 4);
    }

    @Override
    public void make_sound() {
        System.out.println(name + " barks.");
    }

    @Override
    public void walk() {
        System.out.println(name + " walks proudly on " + num_legs + " legs.");
    }
}

// Derived class Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name, "meows", 4);
    }

    @Override
    public void make_sound() {
        System.out.println(name + " meows.");
    }

    @Override
    public void walk() {
        System.out.println(name + " walks gracefully on " + num_legs + " legs.");
    }
}

// Derived class Bird
class Bird extends Animal {
    public Bird(String name) {
        super(name, "chirps", 2);
    }

    @Override
    public void make_sound() {
        System.out.println(name + " chirps.");
    }

    @Override
    public void walk() {
        System.out.println(name + " walks and flies.");
    }

    public void fly() {
        System.out.println(name + " flies in the sky.");
    }
}

// Main class  to demonstrate behavior
public class Animal_Family1{
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        dog.make_sound();
        dog.walk();

        cat.make_sound();
        cat.walk();

        bird.make_sound();
        bird.walk();
        bird.fly();
    }
}