import java.util.Date;

public class Tarea {
    private String descripcion;
    private String materia;
    private Date fechaLimite;
    private int prioridad;

    public Tarea(String descripcion, String materia, Date fechaLimite, int prioridad) {
        this.descripcion = descripcion;
        this.materia = materia;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", materia='" + materia + '\'' +
                ", fechaLimite=" + fechaLimite +
                ", prioridad=" + prioridad +
                '}';
    }
}
