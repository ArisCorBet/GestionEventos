import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear organizador
        Organizador organizador = new Organizador(1, "Juan", "Perez", "juan.perez@example.com", "123456789");

        // Crear evento
        Evento evento = new Evento(1, TipoEvento.CONFERENCIA, "Conferencia de Java", "2023-12-01", new ArrayList<>(), null, organizador);

        // Crear participantes
        ParticipanteRegular participanteRegular = new ParticipanteRegular("Ana", "Gomez", "ana.gomez@example.com", "987654321");
        ParticipanteVIP participanteVIP = new ParticipanteVIP("Carlos", "Lopez", "carlos.lopez@example.com", "456789123", "Empresa XYZ");

        // Registrar participantes en el evento
        evento.registrarParticipante(participanteRegular);
        evento.registrarParticipante(participanteVIP);

        // Obtener información del evento
        System.out.println(evento.obtenerInfoEvento());

        // Listar participantes
        System.out.println("Lista de Participantes:");
        for (Participante participante : evento.getListaParticipante()) {
            System.out.println("Participante: " + participante.getNombre() + " " + participante.getApellido() + " - Tipo: " + participante.getTipo());
        }

        // Asociar elemento complementario
        ElementoCompletario elemento = new ElementoCompletario(1, "Coffee Break", "Pausa para café", "2023-12-01", "10:00", "Sala A", 50, 100, organizador);
        evento.asociarElementoComplementario(elemento);

        // Mostrar información del elemento complementario
        System.out.println("\nInformación del Elemento Complementario:");
        System.out.println(evento.getElementoCompletario().obtenerInfoElemento());
    }
}
