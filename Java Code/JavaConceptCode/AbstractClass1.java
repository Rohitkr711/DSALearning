import java.util.Scanner;

abstract class Shape{
    abstract void setInput();
    abstract void area();
}
class Rectangle extends Shape{
    int l,b;

    @Override
    void setInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of length : ");
        l=sc.nextInt();

        System.out.println("Enter the value of breadth");
        b=sc.nextInt();
        
    }

    @Override
    void area(){
        int area=l*b;
        System.out.println("The area of rectangle : "+area);
    }
}

public class AbstractClass1 {
    public static void main(String[] args) {
        Shape s1=new Rectangle();
        s1.setInput();
        s1.area();
    }
}
