public abstract class SingleInheritance {
    final String kingdom = "Animalia"; // Final variable

    abstract void sound(); // Abstract method

    final void breath() { // Final method
        System.out.println("Animal breathes oxygen.");
    }
}