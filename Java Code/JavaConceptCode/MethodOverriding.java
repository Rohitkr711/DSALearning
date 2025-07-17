class RBI{
    int loan(){
        System.out.println("Each bank should provide loan");
        return 10;
    }

}
class SBI extends RBI{
    float loan(){
        System.out.println("Providing load @11.25%");
        return 100.3;
    }
}
public class MethodOverriding{
     public static void main(String[] args) {
        RBI obj1=new SBI();
        obj1.loan();
    }
}
