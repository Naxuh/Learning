import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Class_04_02_2024
{
    public static void main(String [] args)
    {
        Stack<Integer> stack = new Stack<Integer>(); // Create a stack

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Remove the top element from the stack
        int removed_element_stack = stack.pop();
        System.out.println("Removed element: " + removed_element_stack);

        // See the top element of the stack without removing it
        int top_element_without_removing = stack.peek();
        System.out.println("Top element without removing: " + top_element_without_removing);

        // Print the stack after removing an element
        System.out.println("Stack after removing an element: " + stack);

        // Crear una cola
        Queue<Integer> queue = new LinkedList<>();

        // Agregar elementos a la cola
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Imprimir la cola
        System.out.println("Cola: " + queue);

        // Quitar el elemento del frente de la cola
        int removed_element_queue = queue.poll();
        System.out.println("Elemento quitado: " + removed_element_queue);

        // Ver el elemento del frente de la cola sin quitarlo
        int front_element_without_removing = queue.peek();
        System.out.println("Elemento del frente sin quitar: " + front_element_without_removing);

        // Imprimir la cola después de quitar un elemento
        System.out.println("Cola después de quitar un elemento: " + queue);

        // Crear una linked list
        LinkedList<Integer> linked_list = new LinkedList<>();

        // Agregar elementos a la linked list
        linked_list.add(1);
        linked_list.add(2);
        linked_list.add(3);

        // Imprimir la linked list
        System.out.println("Linked list: " + linked_list);

        // Quitar un elemento de la linked list
        linked_list.remove(1);
        System.out.println("Linked list después de quitar un elemento: " + linked_list);

        // Verificar si la linked list contiene un elemento
        boolean contains_element = linked_list.contains(2);
        System.out.println("La linked list contiene el elemento 2: " + contains_element);

        // Obtener el tamaño de la linked list
        int size_linked_list = linked_list.size();
        System.out.println("Tamaño de la linked list: " + size_linked_list);

        // Obtener el elemento en una posición específica
        int element_at_index = linked_list.get(0);

        // Reemplazar un elemento en una posición específica
        linked_list.set(0, 4);
    }
}