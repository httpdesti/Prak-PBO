public abstract class HierarchicalInheritance {
    final String kingdom = "Animalia"; // Final variable

    abstract void move(); // Abstract method

    final void reproduce() { // Final method
        System.out.println("Animal reproduces.");
    }
}