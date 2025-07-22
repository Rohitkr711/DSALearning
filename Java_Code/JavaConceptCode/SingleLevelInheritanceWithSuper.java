class A{
   int x=100;
}
class B extends A{
    int x=200;
    B(){
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class SingleLevelInheritanceWithSuper {
    public static void main(String[] args) {
        B b=new B();
    }
}
