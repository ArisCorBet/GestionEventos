public class ElementoCompletario {
    private int numeroElementoCompletario;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String hora;
    private String ubicacion;
    private int cuposDisponibles;
    private int cuposTotales;
    private Organizador organizador;

    public ElementoCompletario(int numeroElementoCompletario, String nombre, String descripcion, String fecha, String hora, String ubicacion, int cuposDisponibles, int cuposTotales, Organizador organizador) {
        this.numeroElementoCompletario = numeroElementoCompletario;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.cuposDisponibles = cuposDisponibles;
        this.cuposTotales = cuposTotales;
        this.organizador = organizador;
    }

    public String getNombre() {
        return nombre;
    }

    public String obtenerInfoElemento() {
        return "Elemento Complementario:\n" +
                "Número: " + numeroElementoCompletario + "\n" + // Actualizado
                "Nombre: " + nombre + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Fecha: " + fecha + "\n" +
                "Hora: " + hora + "\n" +
                "Ubicación: " + ubicacion + "\n" +
                "Cupos Disponibles: " + cuposDisponibles + "\n" +
                "Cupos Totales: " + cuposTotales + "\n" +
                "Organizador: " + organizador.getNombre();
    }
}
