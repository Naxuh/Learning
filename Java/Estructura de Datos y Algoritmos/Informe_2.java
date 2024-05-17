/*
    Una persona que usted quiere mucho ya no puede pagar más un reproductor de música premium, usted (05/16/2024)
    y sus grandes habilidades tecnológicas decide poner su mente y corazón en armarle su propio reproductor de
    música usando las estructuras lineales aprendidas en su ramo favorito "Estructura de Datos y Algoritmos".
    Se debe diseñar e implementar un sistema de reproducción de música utilizando el lenguaje de programación
    Java. El sistema debe ser capaz de realizar las siguientes operaciones:
    
    1. Agregar Canción: Permite al usuario agregar una nueva canción al sistema, incluyendo su título, artista
    y duración. Las canciones agregadas se colocarán en la cola de reproducción.
    
    2. Eliminar Canción: Permite al usuario eliminar una canción del sistema utilizando su nombre y artista.
    La canción se eliminará de la cola de reproducción.
    
    3. Historial de Reproducción: Mantiene un registro de las canciones reproducidas por el usuario en orden
    cronológico inverso, utilizando un stack para el historial.
    
    4. Reproducir: Permite al usuario reproducir la siguiente canción de la cola de reproducción en el orden en
    que fueron agregadas (elimina la actual de la cola de reproducción y avanza al siguiente).
    
    5. Biblioteca de Reproducción: Permite al usuario generar nuevas colas de reproducción y gestionarlas.
    La biblioteca se manejará como una Lista de Colas, donde cada elemento de la lista representa una cola
    de reproducción independiente.
    
    Para implementar este sistema, debe cumplir con las siguientes características:
    - Debe existir un main con el cual se puedan utilizar todas las funciones y probar su utilidad.
    - Utilizar clases y objetos para representar canciones, el historial de reproducción y las colas de reproducción.
    - Utilizar la clase LinkedList para implementar la Biblioteca, la cual es una Lista de Colas de reproducción.
*/

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Informe_2
{
    public static void main(String[] args)
    {
        Reproductor reproductor = new Reproductor();
        Cancion rich_flex = new Cancion("Rich Flex", "Drake", "7:37");
        reproductor.agregar_cancion(rich_flex);
        // reproductor.eliminar_cancion(rich_flex);
        reproductor.reproducir();
    }

    public static class Cancion
    {
        private String titulo, artista, duracion;
        
        Cancion(String titulo, String artista, String duracion)
        {
            this.titulo = titulo;
            this.artista = artista;
            this.duracion = duracion;
        }        
    }

    public static class Reproductor
    {
        private Queue<Cancion> cola;
        private Stack<Cancion> historial;

        public Reproductor()
        {
            this.cola = new LinkedList<>();
            this.historial = new Stack<>();
        }

        void agregar_cancion(Cancion e)
        {
            cola.add(e);
            System.out.println("Se ha agregado la cancion '" + e.titulo + "'");
        }

        void eliminar_cancion(Cancion e)
        {
            Queue<Cancion> temp = new LinkedList<>();

            for (int i = 0; i < cola.size(); ++i)
            {
                if (cola.poll().titulo != e.titulo && cola.poll().artista != e.artista)
                {
                    temp.add(cola.poll());
                } else
                {
                    System.out.println("Se ha eliminado la cancion '" + e.titulo + "'");
                }
            }
        }

        void reproducir()
        {
            if (cola.isEmpty())
            {
                System.out.println("La cola de canciones está vacía. No hay canciones para reproducir.");
                return;
            } else
            {
                Cancion cancion_actual = cola.poll();
                System.out.println("Reproduciendo: " + cancion_actual.titulo);
                historial.push(cancion_actual);
            }
        }
    }
}
