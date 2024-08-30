//Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Bird chirps");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test polymorphism
public class AnimalFamily {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Animal reference and object
        Animal myBird = new Bird();  // Animal reference but Bird object
        Animal myCat = new Cat();  // Animal reference but Cat object

        myAnimal.sound();
        myBird.sound();
        myCat.sound();
    }
}