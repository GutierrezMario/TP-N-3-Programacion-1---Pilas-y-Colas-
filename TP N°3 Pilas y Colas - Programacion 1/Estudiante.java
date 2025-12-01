public class Estudiante {
    private String nombre;
    private Pila tareasPendientes;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.tareasPendientes = new Pila();
    }

    public void agregarTarea(Tarea tarea) {
        tareasPendientes.insertar(tarea);
    }

    public Tarea completarUltimaTarea() {
        return (Tarea) tareasPendientes.quitar();
    }

    public Tarea verProximaTarea() {
        return (Tarea) tareasPendientes.verCima();
    }

    public String getNombre() {
        return nombre;
    }
}
