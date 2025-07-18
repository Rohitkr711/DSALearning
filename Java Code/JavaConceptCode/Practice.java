class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}

public class Practice{
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}

