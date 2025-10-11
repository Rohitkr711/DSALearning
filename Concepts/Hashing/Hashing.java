package Concepts.Hashing;

import java.util.Scanner;

public class Hashing {

    static int numberHashing(int[] arr) {
        // arr is array who's values we will map

        // Prestore
        int[] hashArr = new int[100000000]; // creates a map of length according to our number asking range even array
                                            // length is small
        System.out.println("Array memory got located");
        for (int i = 0; i < arr.length; ++i) { // mapping frequency of each arr's ele into hash array
            hashArr[arr[i]]++;
        }

        // Fetching
        int query = 5;
        while (query > 0) { // it helps to fetch the frequency of values arr
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to check its frequncy");
            int num = sc.nextInt();
            System.out.println(hashArr[num]);
            --query;
        }

        return 0;
    }

    static boolean charHashing(String str) {
        char[] charArr = str.toCharArray();
        // for (int i = 0; i < charArr.length; ++i) {
            
        //     System.out.println(charArr[i]);
        // }

        int[] hashArr = new int[26];
        
        for (int i = 0; i < charArr.length; ++i) {
            hashArr[charArr[i]-'a']++;
            
        }
        // for (int i = 0; i < hashArr.length; ++i) {
        //       System.out.println("Index"+i+" = "+hashArr[i]);
        // }

        // Fetching
        int query = 5;
        while (query > 0) { // it helps to fetch the frequency of values arr
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to check its frequncy");
            int charCode = (int)sc.next().charAt(0);
            System.out.println(hashArr[charCode-97]);
            --query;
        }

        return true;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2 };
        // numberHashing(arr);
        String str = "ambcbak";
        charHashing(str);
    }
}
