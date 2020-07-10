package Exercise7_5;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Exercise7_5 {

    public static boolean areFactors (int[] array, int n) {
        int counter = 0;
        boolean areFactors;
        boolean contains = IntStream.of(array).anyMatch(i -> i==0);
        if (contains) {
            return false;
        } else {
            for (int i : array) {
                if (n % i == 0) {
                    counter++;
                }
            }
        }
        areFactors = array.length == counter;
        return areFactors;
    }

    public static void main(String[] args) {
        int[] myArray = {2,4,1,3,6,12,4,3,24};
        System.out.println(areFactors(myArray, 24));
    }
}
