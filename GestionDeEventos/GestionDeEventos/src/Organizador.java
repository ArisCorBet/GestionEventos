public class Organizador {
    private int numeroOrganizador;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Organizador(int numeroOrganizador, String nombre, String apellido, String correo, String telefono) {
        this.numeroOrganizador = numeroOrganizador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getNumeroOrganizador() {
        return numeroOrganizador;
    }

    public void setNumeroOrganizador(int numeroOrganizador) {
        this.numeroOrganizador = numeroOrganizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
