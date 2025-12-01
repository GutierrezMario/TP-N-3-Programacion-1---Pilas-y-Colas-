public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void insertar(Object dato) { 
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Object quitar() { 
        if (estaVacia()) return null;
        Object dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return dato;
    }

    public Object verFrente() { 
        return estaVacia() ? null : frente.dato;
    }

   
    public void procesarRecursivo() {
        if (!estaVacia()) {
            Object dato = quitar();
            System.out.println("Procesando: " + dato);
            procesarRecursivo();
        }
    }
}
