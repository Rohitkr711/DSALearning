package Java_Code.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = { 12, 345, 2, 6, 7896 };
        System.out.println(nosHaveEvenDigit(arr));
    }

    static int nosHaveEvenDigit(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (checkEvenDigit(arr[i]))
                ++count;
        }
        return count;
    }

    static boolean checkEvenDigit(int num) {
        int digitCount = 0;

        while (num > 0) {
            ++digitCount;
            num = num / 10;
        }
        if (digitCount % 2 == 0)
            return true;
        else
            return false;
    }
}
