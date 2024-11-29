public class ParticipanteVIP extends Participante {
    private String empresa;

    public ParticipanteVIP(String nombre, String apellido, String email, String telefono, String empresa) {
        super(nombre, apellido, email, telefono);
        this.empresa = empresa;
    }

    @Override
    public String getTipo() {
        return "VIP";
    }

    public String getEmpresa() {
        return empresa;
    }
}
