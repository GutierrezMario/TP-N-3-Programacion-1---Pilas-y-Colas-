public class HistorialCambios {
    private Pila historial;

    public HistorialCambios() {
        historial = new Pila();
    }

    public void registrarCambio(CambioNota cambio) {
        historial.insertar(cambio);
    }

    public CambioNota deshacerUltimoCambio() {
        return (CambioNota) historial.quitar();
    }
}
