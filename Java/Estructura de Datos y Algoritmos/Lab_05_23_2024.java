/*
    Implementar un BST para mejorar los rendimientos y tiempos de sus algoritmos que utiliza en la vida diaria.
    Esta implementacion debe contar con los metodos de insercion, busqueda, eliminacion y alguno de los 3 metodos de imprimir (in-order, pre-order y post-order, idealmente los 3).
*/

public class Lab_05_23_2024
{
    public class BinarySearchTree
    {
        public class Node
        {
            int value;
            Node left;
            Node right;
        
            Node(int value)
            {
                this.value = value;
                left = right = null;
            }
        }
        
        private Node root;

        BinarySearchTree()
        {
            this.root = null;
        }

        void insertar()
        {
            if (root == null)
            {
                
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("");    
    }
}
