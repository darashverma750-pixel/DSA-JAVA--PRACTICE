public class basic {
    // Binary Search method
    public static int binarySearch(int arr[], int target) {
        int left = 0;                 // starting index
        int right = arr.length - 1;   // ending index

        while (left <= right) {
            int mid = left + (right - left) / 2;  // middle index

            // Check if target is at mid
            if (arr[mid] == target) {
                return mid;  // target found, return index
            }

            // If target is smaller, ignore right half
            if (arr[mid] > target) {
                right = mid - 1;
            }
            // If target is larger, ignore left half
            else {
                left = mid + 1;
            }
        }
        return -1;  // target not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};  // sorted array
        int target = 10;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
