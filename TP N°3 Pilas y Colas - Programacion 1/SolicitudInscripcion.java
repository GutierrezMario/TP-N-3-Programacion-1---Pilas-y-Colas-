import java.util.Date;

public class SolicitudInscripcion {
    private String estudiante;
    private String materia;
    private Date fechaSolicitud;
    private String estado; 
    public SolicitudInscripcion(String estudiante, String materia) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.fechaSolicitud = new Date();
        this.estado = "pendiente";
    }

    @Override
    public String toString() {
        return "SolicitudInscripcion{" +
                "estudiante='" + estudiante + '\'' +
                ", materia='" + materia + '\'' +
                ", fechaSolicitud=" + fechaSolicitud +
                ", estado='" + estado + '\'' +
                '}';
    }
}
