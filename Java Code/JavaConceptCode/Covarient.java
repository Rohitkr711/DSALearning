class A{

}
class B extends A{

}
class C extends B{

}

class Shape{
    public B draw(){
        System.out.println("Inside shape class");
        return new B();
    }
} 

class Rectangle extends Shape{
    @Override
    public A draw(){
        System.out.println("Drawing rectangle");
        return new A();
    }
}

public class Covarient {
    public static void main(String[] args) {
        Shape s1=new Rectangle();
        System.out.println(s1.draw());
    }
}
