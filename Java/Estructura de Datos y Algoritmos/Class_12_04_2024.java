// Binary Search

public class Class_12_04_2024
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 5;
        System.out.println(binary_search(arr, x));
    }

    public static int binary_search(int[] arr, int x)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
