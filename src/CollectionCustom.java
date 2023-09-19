import java.util.Arrays;

public class CollectionCustom<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CollectionCustom() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(T element) {
        ensureCapacity();
        System.arraycopy(elements, 0, elements, 1, size);
        elements[0] = element;
        size++;
    }

    public void addLast(T element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    public void add(T element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }

    public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                T removedElement = (T) elements[i];
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[size - 1] = null;
                size--;
                return removedElement;
            }
        }
        return null;
    }

    public void removeAll(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[size - 1] = null;
                size--;
                i--; // Decremento para verificar el elemento actual nuevamente
            }
        }
    }

    public boolean empty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // Método para obtener un elemento en una posición específica
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (T) elements[index];
    }
}


