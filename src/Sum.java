public class Sum {
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
