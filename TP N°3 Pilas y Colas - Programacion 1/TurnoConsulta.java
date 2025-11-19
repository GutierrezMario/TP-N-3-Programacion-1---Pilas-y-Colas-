import java.util.Date;

public class TurnoConsulta {
    private String estudiante;
    private String motivo;
    private Date horaLlegada;
    private int duracionEstimada;

    public TurnoConsulta(String estudiante, String motivo, int duracionEstimada) {
        this.estudiante = estudiante;
        this.motivo = motivo;
        this.horaLlegada = new Date();
        this.duracionEstimada = duracionEstimada;
    }

    @Override
    public String toString() {
        return "TurnoConsulta{" +
                "estudiante='" + estudiante + '\'' +
                ", motivo='" + motivo + '\'' +
                ", horaLlegada=" + horaLlegada +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}