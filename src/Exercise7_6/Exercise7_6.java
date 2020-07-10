package Exercise7_6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise7_6 {
    public static boolean arePrimeFactors (int[] array, int n) {
        int counter = 0;
        int multiplyAll = 1;
        for (int i : array) { // prime check
            for (int j = 2; j <= i/2; j++) { // check half of the numbers til n if they're divisors of n.
                if (i % j == 0 || i==0) {
                    System.out.println("Array has some zero OR non-prime numbers!");
                    return false; // terminates the program if one number isn't prime.
                }
            }
            counter++; // if loop ends without returning false, number is prime and added to counter
        }

        for (int i : array) { // check if multiplying elements equals to n
            multiplyAll *= i;

        }
        if ((counter == array.length) && (multiplyAll == n)) {
            System.out.printf("All numbers are prime and their product is %d.", n);
            return true;
        }
        System.out.printf("Either numbers aren't prime or their product isn't %d.%n", n);
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = {2,3,7, 1,11, 13, 17, 19, 5};
        System.out.println("=================================== Result" +
                " ====================================");
        System.out.printf("%n%b", arePrimeFactors(myArray, 9699690));

        //================================= Validate result ==================================
        System.out.println("\n=================================== Validate result test" +
                " ====================================");
        int placeHolder = 1;
        for (int i : myArray) {
            placeHolder *= i;
        }

        System.out.println("Array is: " + Arrays.toString(myArray));
        System.out.println("Product is: " + placeHolder);

    }
}
