import java.util.*;

public class Linked_List
{
    private Node head;

    private static class Node
    {
        private int value;
        private Node next;

        Node(int value)
        {
            this.value = value;
        }
    }

    // Agrega un elemento al principio de la lista
    public void add_first(int value)
    {
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
    }

    // Agrega un elemento al final de la lista
    public void add_last(int value)
    {
        Node new_node = new Node(value);

        if (head == null)
        {
            head = new_node;
        } else
        {
            Node current = head;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    // Elimina el primer elemento con el valor dado
    public void remove(int value)
    {
        if (head == null) return;

        if (head.value == value)
        {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null)
        {
            if (current.next.value == value)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Busca un elemento en la lista
    public boolean contains(int value)
    {
        Node current = head;
        while (current != null)
        {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Muestra la lista
    public void print_list()
    {
        Node current = head;
        while (current != null)
        {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Linked_List list = new Linked_List();
        list.add_first(1);
        list.add_first(2);
        list.add_last(3);
        list.print_list();  // Imprime: 2 1 3
        list.remove(1);
        list.print_list();  // Imprime: 2 3
        System.out.println(list.contains(3));  // Imprime: true
    }

    public static void linked_list()
    {
        LinkedList<Integer> list = new LinkedList<>();
    
        // Agrega elementos al principio de la lista
        list.addFirst(1);
        list.addFirst(2);
    
        // Agrega elementos al final de la lista
        list.addLast(3);
        list.addLast(4);
    
        // Imprime la lista
        System.out.println(list);  // Imprime: [2, 1, 3, 4]
    
        // Elimina el primer elemento con el valor dado
        list.removeFirstOccurrence(1);
        System.out.println(list);  // Imprime: [2, 3, 4]
    
        // Verifica si un elemento está en la lista
        System.out.println(list.contains(3));  // Imprime: true
    
        // Obtiene el tamaño de la lista
        System.out.println(list.size());  // Imprime: 3

        list.clear();  // Elimina todos los elementos de la lista
    }

    public static void invertir_linked_list(LinkedList<Integer> list)
    {
        LinkedList<Integer> aux_list = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--)
        {
            aux_list.add(list.get(i));
        }
        
        System.out.println(aux_list);
    }
}
