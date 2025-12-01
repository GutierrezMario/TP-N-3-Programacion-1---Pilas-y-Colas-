public class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void insertar(Object dato) { 
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    public Object quitar() { 
        if (estaVacia()) return null;
        Object dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    public Object verCima() { 
        return estaVacia() ? null : cima.dato;
    }


    public void vaciarRecursivo() {
        if (!estaVacia()) {
            quitar();
            vaciarRecursivo();
        }
    }
}
