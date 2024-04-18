/*
Invertir un entero
Dado un numero entero n, disene un algoritmo que invierta sus digitos.

Input: n = 2674
Output: 4762
*/

/*
import java.util.Scanner;

public class Guia_26_03_2024 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");

        int num = scanner.nextInt();

        System.out.println(reverse_integer(num));

        scanner.close();
    }

    public static int reverse_integer(int n)
    {
        String str = Integer.toString(n);
        String reversed_str = new StringBuilder(str).reverse().toString();
        int reversed_int = Integer.parseInt(reversed_str);
        return reversed_int;
    }
    
    // Otra forma de hacerlo
    public static int reverse_integer(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    
}
*/

/*
Todos los pares de un arreglo
Sea un arreglo de n enteros disene un algoritmo que retorne una matriz a de n filas y 2 columnas
dimensiones que contenga cada par posible en el arreglo.

Input:
n = 3
a = {1, 2, 3}
Output:
{ {1, 1}, {1, 2} {1, 3},
{2, 1}, {2, 2}, {2, 3},
{3, 1}, {3, 2}, {3, 3} }
*/

import java.util.Scanner;

public class Guia_26_03_2024
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Ingrese " + n + " elementos (en la misma linea): ");
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();
    }
}

/*
Multiplicacion de matrices
Sean dos matrices m_1 y m_2, ambas matrices de n filas y N columnas. Disene un algoritmo que reciba
dos matrices de enteros como entrada y retorne la matriz resultante al multiplicar ambas matrices.

Input:
n = 2
m_1 = {{2, 2}, {3, 3}}
m_2 = {{5, 5}, {10, 10}}
Output: {{30, 30}, {45, 45}}
2
*/