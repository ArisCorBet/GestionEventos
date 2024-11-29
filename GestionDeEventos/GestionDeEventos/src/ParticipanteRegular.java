public class ParticipanteRegular extends Participante {
    public ParticipanteRegular(String nombre, String apellido, String email, String telefono) {
        super(nombre, apellido, email, telefono);
    }

    @Override
    public String getTipo() {
        return "Regular";
    }
}
