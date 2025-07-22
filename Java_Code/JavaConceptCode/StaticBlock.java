class Test{
    static int a=10;
    Test(){
        System.out.println("It is a constructor");
        System.out.println("value of a: "+a);
    }
    {
        System.out.println("Instance block");
        System.out.println("value of a: "+a);

    }
    static{
        System.out.println("static block");
        System.out.println("value of a: "+a);
    }
    public static void checkStatic(){
        System.out.println("static method");
    }
    
}

public class StaticBlock {
    public static void main(String[] args) {
        Test.checkStatic();
        Test t1=new Test();

   }    
}
