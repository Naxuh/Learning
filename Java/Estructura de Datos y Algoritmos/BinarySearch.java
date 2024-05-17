public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // arr[6]
        System.out.println(binary_search_rc(arr, 6, 0, 6));
    }

    public static int binary_search_it(int[] arr, int target) // Forma iterativa
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int binary_search_rc(int[] arr, int target, int low, int high) // Forma recursiva
    {
        if (high < low)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        // Revisar si target es menor que arr[mid], llamar a la funcion con los nuevos limites
        if (arr[mid] < target)
            return binary_search_rc(arr, target, mid + 1, high);

        else return binary_search_rc(arr, target, low, mid - 1);
    }
}