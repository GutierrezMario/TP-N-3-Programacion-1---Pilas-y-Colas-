public class ListaEnlazada {
    private Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
            return;
        }
        Nodo actual = primero;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int size() {
        int c = 0;
        Nodo actual = primero;
        while (actual != null) {
            c++;
            actual = actual.siguiente;
        }
        return c;
    }
}
