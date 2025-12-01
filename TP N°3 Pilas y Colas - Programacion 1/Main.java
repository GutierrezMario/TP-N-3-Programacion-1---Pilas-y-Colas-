import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        HistorialCambios historial = new HistorialCambios();
        historial.registrarCambio(new CambioNota("E1", "Matemática", 7, 9));
        historial.registrarCambio(new CambioNota("E1", "Programación", 8, 10));

        System.out.println("Deshacer último cambio: " + historial.deshacerUltimoCambio());
        System.out.println("Deshacer otro cambio: " + historial.deshacerUltimoCambio());

        
        GestorInscripciones gestor = new GestorInscripciones();
        gestor.agregarSolicitud(new SolicitudInscripcion("Mario", "Diseño Web"));
        gestor.agregarSolicitud(new SolicitudInscripcion("Camila", "Matemática"));

        System.out.println("Siguiente solicitud: " + gestor.verSiguienteSolicitud());
        System.out.println("Procesando solicitud: " + gestor.procesarSiguienteSolicitud());
        System.out.println("Cantidad de solicitudes pendientes: " + gestor.cantidadSolicitudesPendientes());

     
        Estudiante estudiante = new Estudiante("Mario");
        estudiante.agregarTarea(new Tarea("TP Nº3 Pilas y Colas", "Programación", new Date(), 1));
        estudiante.agregarTarea(new Tarea("Estudiar para parcial", "Matemática", new Date(), 2));

        System.out.println("Próxima tarea: " + estudiante.verProximaTarea());
        System.out.println("Completando tarea: " + estudiante.completarUltimaTarea());
        System.out.println("Próxima tarea ahora: " + estudiante.verProximaTarea());

    
        Profesor profesor = new Profesor("Martin Gonzalez");
        profesor.agregarEstudianteACola(new TurnoConsulta("Mario", "Consulta sobre TP3", 30));
        profesor.agregarEstudianteACola(new TurnoConsulta("Camila", "Dudas de Matemática", 20));

        System.out.println("Siguiente en cola: " + profesor.verSiguienteEnCola());
        System.out.println("Atendiendo estudiante: " + profesor.atenderSiguienteEstudiante());
        System.out.println("Siguiente en cola ahora: " + profesor.verSiguienteEnCola());
    }
}
