public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {-1, 2, 3};
        int[] arr3 = {1, -2, 3};
        int[] arr4 = {0, 0, 0};
        try {
            System.out.println(sum(arr1));
            System.out.println(sum(arr2));
            System.out.println(sum(arr3));
            System.out.println(sum(arr4));
        } catch (NegativeElementException err) {
            System.out.println(err);
        }
    }

    public static int sum(int[] arr) throws NegativeElementException {

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