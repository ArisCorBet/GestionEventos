import java.util.ArrayList;
import java.util.List;

public class Evento {
    private int numEvento;
    private TipoEvento tipo;
    private String nombre;
    private String fecha;
    private List<Participante> listaParticipantes;
    private ElementoCompletario elementoComplementario;
    private Organizador organizador;

    public Evento(int numEvento, TipoEvento tipo, String nombre, String fecha, List<Participante> listaParticipantes, ElementoCompletario elementoComplementario, Organizador organizador) {
        this.numEvento = numEvento;
        this.tipo = tipo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.listaParticipantes = listaParticipantes != null ? listaParticipantes : new ArrayList<>();
        this.elementoComplementario = elementoComplementario;
        this.organizador = organizador;
    }



    public void registrarParticipante(Participante participante) {
        listaParticipantes.add(participante);
        System.out.println("Participante registrado: " + participante.getNombre() + " " + participante.getApellido());
    }

    public String obtenerInfoEvento() {
        return "Evento Nº: " + numEvento + " | Nombre: " + nombre + " | Tipo: " + tipo + " | Fecha: " + fecha;
    }

    public List<Participante> getListaParticipante() {
        return listaParticipantes;
    }



    public void asociarElementoComplementario(ElementoCompletario elemento) {
        this.elementoComplementario = elemento;
    }

    public ElementoCompletario getElementoCompletario() {
        return elementoComplementario;
    }
}
