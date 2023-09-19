public class Main {
    public static void main(String[] args) {
        CollectionCustom<Integer> customCollection = new CollectionCustom<>();

        // Agregar elementos
        customCollection.addLast(1);
        customCollection.addLast(2);
        customCollection.addLast(3);
        customCollection.addFirst(0);
        customCollection.addLast(2);

        System.out.println("Tamaño de la colección: " + customCollection.size());

        // Mostrar la colección
        System.out.println("Colección:");
        for (int i = 0; i < customCollection.size(); i++) {
            System.out.println(customCollection.get(i));
        }

        // Eliminar un elemento
        int removedElement = customCollection.remove(2);
        System.out.println("Elemento eliminado: " + removedElement);

        // Eliminar todos los elementos 2
        customCollection.removeAll(2);

        System.out.println("Tamaño de la colección después de la eliminación: " + customCollection.size());

        // Verificar si la colección está vacía
        System.out.println("¿La colección está vacía? " + customCollection.empty());
    }
}
