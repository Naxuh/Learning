/*
Missing Number: You are given all numbers between 1,2,..., n except one. Your task is to find the missing number.

Input

The first input line contains an integer n.
The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).

Output

Print the missing number.

Example

Input:
5
2 3 1 5

Output:
4
*/

import java.util.Scanner;

public class Class_03_12_2024
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i ++)
        {
            array[i] = scanner.nextInt();
        }

        System.out.println(missing_number(array));

        scanner.close();
    }
    public static int missing_number(int[] array)
    {
        boolean[] table = new boolean[array.length + 1];
        for (int i = 0; i < array.length; i++)
        {
            table[array[i] - 1] = true;
        }
        for (int i = 0; i < table.length; i++)
        {
            if (!table[i])
            {
                return i + 1;
            }
        }
        return -1;
    }
}

