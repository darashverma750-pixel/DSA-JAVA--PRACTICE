public class Implement0sAnd1s {
      public static int[] sortarray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 1, 0, 0};
        int[] result = sortarray(arr);  // ✅ Correct function call

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}



