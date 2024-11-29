public abstract class Participante {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Participante(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public abstract String getTipo();
}
