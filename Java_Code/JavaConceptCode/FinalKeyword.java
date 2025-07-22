class A{
    final int a=10;
    void set(){
        a=19;
    System.out.println("class-A show");
   }
}

public class FinalKeyword {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.set();
    }
}
