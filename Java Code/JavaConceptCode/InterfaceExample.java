interface Animal {
    int a=9;
    default void Breath(){
        System.out.println("animal is breathing");
    }
    void makeSound(); // Abstract method (must be implemented by classes)
}
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();// Output: Bark! Bark!
        myDog.Breath();
    }
}
