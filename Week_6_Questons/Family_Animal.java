abstract class Animal {
    abstract void makeSound();
}

class Mammal extends Animal {
    @Override
    void makeSound() {
        System.out.println("Mammal sound: Woof, Meow, etc.");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird sound: Chirp, Tweet, etc.");
    }
}

class Fish extends Animal {
    @Override
    void makeSound() {
        System.out.println("Fish sound: Glub, Glub");
    }
}

public class Family_Animal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Mammal();
        animals[1] = new Bird();
        animals[2] = new Fish();

        for (Animal animal : animals) {
            animal.makeSound(); // Demonstrates polymorphism
        }
    }
}