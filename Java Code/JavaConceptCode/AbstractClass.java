abstract class Bike{
    int speed=60;
    Bike(){
        System.out.println("Bike's constructor");
    }
    void getDesignDetails(){
        System.out.println("It is a standard bike");
    }
    abstract void run();
}
class Honda extends Bike{
    Honda(){
        System.out.println("Honda constructor");
    }
    @Override
    void run(){
        System.out.println("Honda runs very smoothly"+speed);
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        Bike b=new Honda();
        b.getDesignDetails();
        b.run();
        System.out.println("speed = "+b.speed);        
    }
}
