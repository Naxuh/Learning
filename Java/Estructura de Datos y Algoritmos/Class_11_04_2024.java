/*
1.- Diseñe un programa que convierta un numero entero a su representación en binario.
2.- Diseñe un programa que determine si una palabra es palíndroma.
*/

import java.util.*;

public class Class_11_04_2024
{
    public static void main(String[] args)
    {
        Input scanner = new Input(System.in);

        // int num = scanner.nextInt();
        // System.out.println(binario(num));

        String word = scanner.nextLine();
        palindroma(word);

        scanner.close();
    }

    public static int binario(int x) // 1
    {
        if (x < 2) return x;
        else return x % 2 + 10 * binario(x / 2);
    }

    public static void palindroma(String word) // 2
    {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) {
                System.out.println("No es palindroma");
            }
        }
        System.out.println("Es palindroma");
    }
}