/*
Ejercicio: Mezclar dos arrays y ordenarlos
En base a un input de dos arrays, mezclarlos en uno solo y ordenarlos, luego calcular su Big-O
Input: n y m (tamaños de los arrays)
Las siguientes 2 líneas entran los n números del array uno y m números del array 2
Ejemplo: n = 3 , m = 4, array 1 = {-3, 1, 4}, array 2 = {-2, 0, 3, 8}
Output: {-3, -2, 0, 1, 3, 4, 8}
*/

import java.util.Scanner;

public class Lab_28_03_2024
{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length of n and m: ");

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] first_array = new int[n];
        int[] second_array = new int[m];

        System.out.print(n + " elements for array 1: ");
        for (int i = 0; i < n; i++) {
            first_array[i] = scanner.nextInt();
        }

        System.out.print(m + " elements for array 2: ");
        for (int i = 0; i < m; i++) {
            second_array[i] = scanner.nextInt();
        }

        mix_ordered_arrays(first_array, second_array);

        scanner.close();
    }

    public static void mix_ordered_arrays(int[] first_array, int[] second_array)
    {
        int[] mixed_array = new int[first_array.length + second_array.length];

        for (int i = 0; i < first_array.length; i++)
        {
            mixed_array[i] = first_array[i];
        }

        for (int i = 0; i < second_array.length; i++)
        {
            mixed_array[first_array.length + i] = second_array[i];
        }

        for (int i = 0; i < mixed_array.length; i++)
        {
            for (int j = 0; j < mixed_array.length - 1; j++)
            {
                if (mixed_array[j] > mixed_array[j + 1])
                {
                    int aux = mixed_array[j];
                    mixed_array[j] = mixed_array[j + 1];
                    mixed_array[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < mixed_array.length; i++)
        {
            System.out.println(mixed_array[i] + " ");
        }
    }
}