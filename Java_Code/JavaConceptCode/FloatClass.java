public class FloatClass {
    public static void main(String args[]){
        float a=Float.parseFloat("12");
        float b=Float.parseFloat("13");
        // System.out.println(a,b);

        System.out.println("a = " + a + ", b = " + b);
        System.out.printf("a = %.12f, b = %.12f\n", a, b);

    }
 
}
