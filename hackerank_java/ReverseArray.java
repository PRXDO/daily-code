package hackerank_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3);
        List<Integer> reversedArray = reverseArray(array);

        System.out.print("Vetor original: ");
        for (int num : array) {
            System.out.print(num + ",");
        }
        System.out.println();

        System.out.print("Vetor invertido: ");
        for (int num : reversedArray) {
            System.out.print(num + ",");
        }
        System.out.println();
    }

    public static List<Integer> reverseArray(List<Integer> array) {
        int n = array.size();
        List<Integer> reversed = new ArrayList<>(n);
        for (int i = n - 1; i >= 0; i--) {
            reversed.add(array.get(i));
        }
        return reversed;
    }

}