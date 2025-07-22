public class PassCurrentObject {
    void display(PassCurrentObject obj) {
        System.out.println("Method called using current object.");
    }

    void show() {
        display(this); // ✅ Passing the current object
    }

    public static void main(String[] args) {
        PassCurrentObject s1 = new PassCurrentObject();
        s1.show();
    }

}