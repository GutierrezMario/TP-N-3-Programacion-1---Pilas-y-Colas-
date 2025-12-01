public class GestorInscripciones {
    private Cola solicitudesPendientes;

    public GestorInscripciones() {
        solicitudesPendientes = new Cola();
    }

    public void agregarSolicitud(SolicitudInscripcion solicitud) {
        solicitudesPendientes.insertar(solicitud);
    }

    public SolicitudInscripcion procesarSiguienteSolicitud() {
        return (SolicitudInscripcion) solicitudesPendientes.quitar();
    }

    public SolicitudInscripcion verSiguienteSolicitud() {
        return (SolicitudInscripcion) solicitudesPendientes.verFrente();
    }

    public int cantidadSolicitudesPendientes() {
        int contador = 0;
        Cola aux = new Cola();
        while (!solicitudesPendientes.estaVacia()) {
            aux.insertar(solicitudesPendientes.quitar());
            contador++;
        }
        
        while (!aux.estaVacia()) {
            solicitudesPendientes.insertar(aux.quitar());
        }
        return contador;
    }
}
