/*
Guia 2: Estructuras de datos, tipo de dato abstracto y recursion
*/

/*
Para cada una de las siguientes preguntas diseñe los algoritmos correspondientes y analice la complejidad de
su algoritmo en términos de O(n).

I. Sea una lista enlazada definida:

class LinkedList {
    class Node {
        int value;
        Node next;
    }
    Node Head;
}

Diseñe el método invertir_lista, que recibe el head de una lista para modificarla y dejarla en orden inverso.

a. Diseñe el método invertir de forma iterativa.
b. Diseñe el método invertir de forma recursiva.
*/

/*
II. Diseñe un algoritmo que reciba como entrada un arreglo de enteros A y luego lo invierta.

a. Diseñe un algoritmo que utilice un stack como estructura de datos auxiliar para invertir el arreglo.
b. Diseñe un algoritmo que invierta el arreglo de forma recursiva, sin utilizar un stack como estructura de datos auxiliar.
c. Diseñe un algoritmo que invierta el arreglo de forma iterativa, sin usar un stack como estructura
de datos auxiliar.

Ejemplo:
Input:
A = {1, 2, 3, 6, 7}

Output:
A’ = {7, 6, 3, 2, 1}
*/

import java.util.*;

public class Guia_2
{   
    public static void main(String[] args)
    {

    }
    
    class LinkedList
    {
        class Node
        {
            int value;
            Node next;
    
            Node(int value)
            {
                this.value = value;
            }
        }
    
        Node head;

        public void invertir_lista(Node head)
        {
            Node prev = null;
            Node current = head;
            Node next = null;

            while (current != null)
            {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }
    }

    public static void print_array(int[] array)
        {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static int[] invert_array_using_stack(int[] array)
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++)
        {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) // 0 1 2 3 4
        {
            array[i] = stack.pop();
        }

        return array;
    }

    public static int[] invert_array_recursively(int[] array, int[] aux_array, int i)
    {
        if (i == array.length)
        {
            return aux_array;
        }

        aux_array[i] = array[array.length - 1 - i];
        return invert_array_recursively(array, aux_array, i + 1);
    }    

    public static int[] invert_array_iteratively(int[] array) // 0 1 2 3 4
    {
        int[] aux_array = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--)
        {
            aux_array[j] = array[i];
            j++;
        }
        return aux_array;
    }
}