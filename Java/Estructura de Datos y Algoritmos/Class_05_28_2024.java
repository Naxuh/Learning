/*
    Level order traversal binary tree & print tree
*/

import java.util.Queue;
import java.util.LinkedList;

public class Class_05_28_2024
{
    public static void main(String[] args)
    {
        BinarySearchTree bst = new BinarySearchTree();
        // Insertar nodos en el bst
        bst.insert(10);
        bst.insert(2);
        bst.insert(3);
        bst.insert(12);
        bst.insert(0);
        bst.insert(5);
        bst.insert(1);
        bst.insert(17);
        bst.insert(8);
        bst.insert(6);
        bst.print_tree(bst.root, "", true);
        bst.level_order();
    }

    public static class BinarySearchTree
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

        public void insert(int element)
        {
            Node temp = new Node(element);

            if (root == null)
            {
                root = temp; // Si el árbol está vacío, la nueva raíz es temp
                return;     // Salimos del método
            }

            Node aux = root;
            while (aux != null)
            {
                if (aux.value > element)
                {
                    if (aux.left == null)
                    {
                        aux.left = temp;
                        return;
                    }
                    else
                    {
                        aux = aux.left;
                    }
                } else // aux.value <= element
                {
                    if (aux.right == null)
                    {
                        aux.right = temp;
                        return;
                    }
                    else
                    {
                        aux = aux.right;
                    }
                }
            }
        }

        public void level_order() {
            if (root == null) {
                return; // Árbol vacío
            }
    
            Queue<Node> cola = new LinkedList<>();
            cola.offer(root); // Encolamos la raíz
    
            while (!cola.isEmpty()) {
                Node actual_node = cola.poll(); // Desencolamos el nodo actual
                System.out.println(actual_node.value); // Procesamos el nodo
    
                // Encolamos los hijos (si existen)
                if (actual_node.left != null) {
                    cola.offer(actual_node.left);
                }
                if (actual_node.right != null) {
                    cola.offer(actual_node.right);
                }
            }
        }

        private void print_tree(Node node, String prefix, boolean is_tail)
        {
            if(node.right != null) {
                print_tree(node.right, prefix + (is_tail ? "│   " : "    "), false);
            }
            System.out.println(prefix + (is_tail ? "└── " : "┌── ") + node.value);
            if(node.left!=null) {
                print_tree(node.left, prefix + (is_tail ? "    " : "│   "), true);
            }
        }
    }
}

