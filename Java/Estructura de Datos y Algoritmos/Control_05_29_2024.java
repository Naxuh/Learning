import java.util.*;

public class Control_05_29_2024
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4 , 4, 5}; // [3], [4], [5] == 3
        s2(arr, 3, 4);
    }

    public static void s1(int[] arr, int target) // Devolver indices de ocurrencias
    {
        int low = 0;
        int high = arr.length - 1;
        Queue<Integer> q = new LinkedList<>();

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                q.offer(mid);
            if (arr[mid] < target)
                low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(q);
    }

    public static void s2(int[] arr, int a, int b) // Contar ocurrencias
    {
        int low = 0;
        int high = arr.length - 1;
        int count = 0;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= a && arr[mid] <= b)
                count++;
            if (arr[mid] < a && arr[mid] < b)
                low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(count);
    }
}
