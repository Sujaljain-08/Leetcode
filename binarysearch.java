public class binarysearch {
    public static int binarysearch(int[] arr, int elem) {
        int low = 0;
        int high = arr.length - 1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] > elem) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // element not found
    }

    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int x = binarysearch(arr, 50);
        System.out.print(x); 
    }
}
