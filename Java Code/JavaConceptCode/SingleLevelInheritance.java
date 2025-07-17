class A{
    int x=100;
}
class B extends A{
    int y=200;
    void show(){
        System.out.println("x value is:"+x);
        System.out.println("y value is:"+y);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
