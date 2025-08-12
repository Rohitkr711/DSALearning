class SumOfDigits{
    public static void main(String[] args) {

        int digitSum = sumOfDigits(38);
        System.out.println(digitSum);
    }

    static int sumOfDigits(int num){
    
        // int sum=0;
        // while(num>0){
        //     int rem=num % 10;
        //     sum+=rem;
        //     num=num/10;
        // }
        // return sum;

        if(num==0){
            return num;

        }

        int rem=num%10;
        return rem + sumOfDigits(num/10);
    }
}