public class InstanceBlock {
    InstanceBlock(){
        System.out.println("This is default constructor");
    }
    {
        System.out.println("This is a instance block");
    }
    public static void main(String[] args) {
        InstanceBlock ins=new InstanceBlock();
    }
}
