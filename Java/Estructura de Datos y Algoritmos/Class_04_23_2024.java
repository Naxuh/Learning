/*
    Merge Sort
*/

public class Class_04_23_2024 
{
    public static void main(String[] args)
    {
        int[] array = {2,1,4,3};
        merge_sort(array, 0, 4);

        for (int i : array)
        {
            System.out.println(i);
        }
    }

    public static void merge(int [] a, int lo, int mid, int hi)
    {
        int[] left = new int[mid - lo + 1];
        int[] right = new int[hi - mid - 1];

        for (int i = 0; i < left.length; i++)
        {
            left[i] = a[lo + i];
        }

        for (int j = 0; j < right.length; j++)
        {
            right[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = lo;

        while (i < (mid - lo + 1) && j < (hi - mid - 1))
        {
            if (left[i] <= right[j])
            {
                a[k] = left[i];
                i++;
            }
            else
            {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < (mid - lo + 1))
        {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < (hi - mid - 1))
        {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void merge_sort(int[] a, int lo, int hi)
    {
        if (lo < hi)
        {
            int mid = (lo + hi) / 2 - 1;
            merge_sort(a, lo, mid);
            merge_sort(a, mid + 1, hi);
            merge(a, lo, mid, hi);
        }
    }
}
