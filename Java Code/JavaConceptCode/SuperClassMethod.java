class first{
    void show(){
        System.out.println("Super class method");
    }
}
class second extends first{
    void show(){
        System.out.println("sub class method");
        super.show();
    }
}

public class SuperClassMethod {
    public static void main(String[] args) {
        System.out.println(new second());
    }
}
