public class NumberSign {
    public static void main(String[] args) {

        int number=Integer.parseInt(args[0]);
        if(number==0){
            System.out.println("User Entered number i.e. Zero");
        }
        else if(number>0){
                System.out.println("User Entered Positive number");
            }else{
                System.out.println("User Entered Negative number");

            }
    }
}
    
