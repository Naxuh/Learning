/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
On each move, you may increase the value of any element by one. What is the minimum number of moves required?

Input

The first input line contains an integer n: the size of the array.

Then, the second line contains n integers x_1, x_2,..., x_n: the contents of the array.

Output

Print the minimum number of moves.

Constraints

1 <= n <= 2 * 10^5
1 <= x_i <= 10^9

Example

Input:
5
3 2 5 1 7

Output:
5
*/

import java.util.Scanner;

public class Class_03_20_2024
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt(); 
        }

        scanner.close();

        increasing_array(array, n);
    }

    public static void increasing_array(int[] array, int n) // {3,2,5,1,7} -> {3,3,5,5,7}
    {
        int moves = 0;

        for (int i = 1; i < n; i++)
        {
            if (array[i] < array[i - 1])
            {
                moves += array[i - 1] - array[i];
                array[i] = array[i - 1];
            }
        }

        System.out.println(moves);
    }
}