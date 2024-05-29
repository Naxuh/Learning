/*
    1. Ordenamiento

        i) Que es un algoritmo de ordenamiento estable?
        
        - Un algoritmo de ordenamiento estable es aquel que mantiene el orden relativo de los elementos con claves iguales. Es decir, si dos elementos tienen la misma clave, el algoritmo de ordenamiento estable no los intercambia de lugar.

        ii) Para cada uno de los siguientes algoritmos de ordenamiento, afirme si es un algoritmo estable o no.
        Para aseverar su afirmacion de un ejemplo en el cual quede claro que dicho algoritmo es estable

        a. InsertionSort: Es un algoritmo estable

        b. SelectionSort: No es un algoritmo estable

        c. BubbleSort: Es un algoritmo estable

        d. MergeSort: Es un algoritmo estable

        iii) Para cada uno de los siguientes algoritmos describa el tiempo de ejecucion para el peor caso, utilizando
        notacion O(f(n)). Adicionalmente, describa en no m ́as de 3 lineas la estrategia en la que se basa cada algoritmo.

        a. InsertionSort: Tiempo de ejecución para el peor caso: O(n^2)

        b. BubbleSort: Tiempo de ejecución para el peor caso: O(n^2)

        c. MergeSort: Tiempo de ejecución para el peor caso: O(nlogn)
    
    2. Busqueda binaria
        
        Resuelva cada uno de los siguientes problemas modificando el algoritmo de busqueda binaria estudiado en
        clases, asuma que los arreglos de entrada ya estan previamente ordenados para cada problema.

        i. Buscar palabras

        Sea un arreglo de palabras ordenado en orden lexicografico, disene un algoritmo de busqueda binaria
        que retorne un booleano, dicho valor representa si la palabra buscada esta presente en el arreglo o no.
        Describa el tiempo de ejecucion de su algoritmo utilizando la notacion O(f(n))

        a. Ejemplo:
        Input: {Aire, Basura, Bicicleta, Guitarra, Zapato}, Guitarra.
        Output: true, la palabra guitarra esta presente en el arreglo.

        b. Ejemplo:
        Input: {Aire, Basura, Bicicleta, Guitarra, Zapato}, Zapatilla.
        Output: false, la palabra zapatilla no esta presente en el arreglo.
*/

public class Guia_3
{
    public static void main(String[] args)
    {
        String[] words = {"a","b","c","d"};
        binary_search(words, "c");
    }

    public static void binary_search(String[] words, String target)
    {
        int left = 0;
        int right = words.length - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (words[mid] == target)
            {
                System.out.println("La palabra " + target + " esta presente en el arreglo.");
                return;
            }
            if (words[mid].compareTo(target) < 0)
                left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("false, la palabra " + target + " no está presente en el arreglo.");
    }
}
