import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {-1, 2, 3};
        int[] arr3 = {1, -2, 3};
        int[] arr4 = {0, 0, 0};

        handledSum(arr1);
        handledSum(arr2);
        handledSum(arr3);
        handledSum(arr4);
    }

    public static void handledSum(int[] array) {
        try {
            System.out.println(Sum.sumArray(array));
        } catch (NegativeElementException err) {
            System.out.println("Cannot sum " + Arrays.toString(array) + ": " + err.getMessage());
        }
    }


}