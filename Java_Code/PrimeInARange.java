import java.util.ArrayList;

class PrimeInARange {

    public static ArrayList<Integer> primeNosInARange(int start, int end) {

        ArrayList<Integer> listOfPrimeNumber = new ArrayList<>();
        boolean numPrime = true;

        for (; start <= end; ++start) {
            numPrime = true;
            int num = start;
            if (num < 2) {
                continue;
            }

            for (int i = 2; i < num; ++i) {
                if (num % i == 0) {
                    numPrime = false;
                    break;
                }
            }
            if (numPrime) {
                listOfPrimeNumber.add(start);
                // System.err.println("added value" + start);
            }
        }

        return listOfPrimeNumber;
    }

    public static void main(String[] args) {
        
        System.out.println("Output"+    primeNosInARange(1,7));

    }
}