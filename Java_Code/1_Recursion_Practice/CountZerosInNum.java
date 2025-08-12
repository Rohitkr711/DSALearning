

public class CountZerosInNum {
    public static void main(String[] args) {
        int count = 0;
        int totalZeros = countZeros(150406, count);
        System.out.println(totalZeros);
    }

    static int countZeros(int num, int count) {

        if (num % 10 == num) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            return countZeros(num / 10, count + 1);
        } else {
            return countZeros(num / 10, count);

        }

    }
}
