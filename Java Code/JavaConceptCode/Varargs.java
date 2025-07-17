class A{
    public void Input(int ...x){
      for(int val:x){
          System.out.println(val+"\n");
      }
    }
}

public class Varargs {
    public static void main(String[] args) {
        A a1=new A();
        a1.Input();
        a1.Input(2);
        a1.Input(2,4,5);

    }
    
}
