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
            System.out.println(sumArray(array));
        } catch (NegativeElementException err) {
            System.out.println("Cannot sum " + Arrays.toString(array) + ": " + err.getMessage());
        }
    }

    public static int sumArray(int[] arr) throws NegativeElementException {

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NegativeElementException(i);
            }
            result += arr[i];
        }
        return result;
    }
}