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

public class Guia_E1_04_16_2024
{
    class LinkedList {
        class Node {
            int value;
            Node next;
    
            Node(int value) {
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

    public static void main(String[] args)
    {

    }
}