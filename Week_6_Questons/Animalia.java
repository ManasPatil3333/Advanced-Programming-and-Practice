abstract class Animal {
    abstract void makeSound();
    abstract void eat();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating bones.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating fish.");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird says: Chirp Chirp");
    }

    @Override
    void eat() {
        System.out.println("Bird is eating seeds.");
    }
}

public class Animalia {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}