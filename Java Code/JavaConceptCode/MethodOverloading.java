class A{
    int x=10;
    public void call(Object a){
        System.out.println(x);
      System.out.println("Method Having object parameter "+a);
    }
    public void call(String a){
     System.out.println("Methods having string parameter "+a);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        A a1=new A();
        a1.call("Rohit");
        a1.call(2);

        A a2=new A();
        a2.call(a1);

    }
    
}
