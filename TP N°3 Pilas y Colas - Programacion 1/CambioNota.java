import java.util.Date;

public class CambioNota {
    private String estudianteId;
    private String materiaId;
    private double notaAnterior;
    private double notaNueva;
    private Date fecha;

    public CambioNota(String estudianteId, String materiaId, double notaAnterior, double notaNueva) {
        this.estudianteId = estudianteId;
        this.materiaId = materiaId;
        this.notaAnterior = notaAnterior;
        this.notaNueva = notaNueva;
        this.fecha = new Date();
    }

    @Override
    public String toString() {
        return "CambioNota{" +
                "estudianteId='" + estudianteId + '\'' +
                ", materiaId='" + materiaId + '\'' +
                ", notaAnterior=" + notaAnterior +
                ", notaNueva=" + notaNueva +
                ", fecha=" + fecha +
                '}';
    }
}
