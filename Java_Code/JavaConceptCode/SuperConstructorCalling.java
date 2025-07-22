class One{
  One(){
    System.out.println("one");
  }
}
class Two extends One{
    Two(){
        System.out.println("Two");
    }
}

public class SuperConstructorCalling {
    public static void main(String[] args) {
        Two t1=new Two();
    }
    
}
