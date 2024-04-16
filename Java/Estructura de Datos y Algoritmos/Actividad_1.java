/*
1.- Collatz:
Considere un algoritmo que recibe como input un entero positivo n. Si n es par el algoritmo lo divide en dos, si n es
impar, el algoritmo lo multiplica por tres y le suma 1. El algoritmo repite la evaluacion anterior hasta que n es uno.
Por ejemplo con n = 3, la secuencia ser ́ıa la siguiente:
3 → 10 → 5 → 16 → 8 → 4 → 2 → 1

Input:
El input del problema consiste en un entero n.

Output:
El output del problema consiste en la secuencia para un n cualquiera.
*/

/*
import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        collatz(num);
        scanner.close();
    }
    public static void collatz(int n)
    {
        while (n != 1)
        {
            System.out.print(n + " -> ");
            if (n % 2 == 0)
            {
                n /= 2;
            }
            else
            {
                n = 3 * n + 1;
            }
        }
        System.out.println(n);
    }
}
*/

/*
2.- Rotacion Izquierda:
Una rotacion a la izquierda en un arreglo, desplaza todos los elementos del arreglo a la izquierda.
Por ejemplo si el arreglo es: {1, 2, 3, 4}
El primer desplazamiento a la izquierda deja al arreglo como: {2, 3, 4, 1}.
El segundo desplazamiento a la izquierda deja al arreglo como: {3, 4, 1, 2}.
Disene e implemente un algoritmo que le permita hacer d desplazamientos a la izquierda en un arreglo.

Input:
La primera linea contiene un entero n que denota la cantidad de elementos en el arreglo, seguido de un entero d que
denota la cantidad de desplazamientos a realizar.
La segunda linea contiene los enteros a0, a1, a2,...,an−1 perteneciente al arreglo.

Output: Imprima los elementos del arreglo tras realizar los d desplazamientos.

Ejemplo:

Input:
1 2 3 4 5

Output:
5 1 2 3 4
*/

import java.util.Scanner;

public class Actividad_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamano del arreglo y cuantos desplazamientos a la izquierda hara: ");

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        int array[] = new int[n];

        System.out.print("Ingrese " + n + " elementos en la misma linea: ");
        for (int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        rotate_left(array, d);
    }
    public static void rotate_left(int[] array, int d) // {0,1,2,3,4} -> {1,2,3,4,0}
    {
        for (int i = 0; i < d; i++) // Cantidad de desplazamientos
        {
            int temp = array[0];
            for (int j = 0; j < array.length - 1; j++)
            {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


/*
3.- Rol Unico Nacional:
Es un numero unico utilizado en Chile para identificar personas con nacionalidad chilena o extranjeros
con residencia en el paıs. El formato del RUN corresponde a x.x.x-y o x.x.x-y, donde:
• x es un digito entre 0 y 9
• y es un digito entre 0 y 9 o K
Por ejemplo 9.231.123-K es un string que cumple con el formato mencionado, pero ¿el digito verificador K realmente es
correcto?, para responder esto es importante investigar el algoritmo que verifica un RUN/RUT: m ́odulo 11.
El algoritmo de m ́odulo 11 tiene los siguientes pasos:
• Iterar de derecha a izquierda sobre los primeros 7 u 8 digitos(x.xxx.xxx o xx.xxx.xxx)
• Por cada iteracion realiza una multiplicaci ́on del dıgito xi con un multiplicador, este multiplicador siempre empieza
en 2 y aumenta en 1 tras cada iteracion. El multiplicador tiene como valor m ́aximo 7 y en caso de alcanzar valor 8,
este se reinicia en 2. Los resultados de cada producto se almacenan como una suma.
• Con la suma de cada producto se hacen los siguientes calculos:
– Se calcula el modulo 11 de la suma (suma mod 11)
– A 11 se le resta el resultado anterior, esta resta debe ser equivalente al digito verificador. Para el caso que el
digito verificador sea K, el resultado de la resta debe ser 10.
Un ejemplo con el RUN 9.231.123-K ser ́ıa el siguiente procedimiento:
• 3 x 2 = 6
• 2 x 3 = 6
• 1 x 4 = 4
• 1 x 5 = 5
• 3 x 6 = 18
• 2 x 7 = 14
• 9 x 2 = 18
• 6 + 6 + 4 + 5 + 18 + 14 + 18 = 71
• 71 % 11 = 5
• 11 - 5 = 6
• Por lo tanto el RUN es incorrecto (10 != 6).
Input:
El input consiste en una linea con un string S en formato xx.xxx.xxx-y o x.xxx.xxx-y. El formato es siempre con
puntos y guion (no es necesario validar el formato, solo el digito verificador y).
Output:
Imprimir true en caso que el run sea verıdico y false en caso contrario.
Ejemplo:
Input:
9.231.123-K
Output:
false
3
*/