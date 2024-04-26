public class Main {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.sound();
        dog.breath();

        Cat cat = new Cat();
        cat.sound();
        cat.breath();

        // Hierarchical Inheritance
        Elephant elephant = new Elephant();
        elephant.move();
        elephant.eat();
        elephant.reproduce();

        // Accessing final variables
        System.out.println("Animal kingdom: " + dog.kingdom);
        System.out.println("Mammal type: " + elephant.type);
    }
}