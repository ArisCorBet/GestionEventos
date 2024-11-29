import java.util.List;

public class SistemaEvento {
    private List<Evento> listaEvento;
    private List<Participante> listaParticipante;
    private List<Organizador> listaOrganizador;
    private List<ElementoCompletario> listaElementoCompletario;

    public SistemaEvento(List<Evento> listaEvento, List<Participante> listaParticipante, List<Organizador> listaOrganizador, List<ElementoCompletario> listaElementoCompletario) {
        this.listaEvento = listaEvento;
        this.listaParticipante = listaParticipante;
        this.listaOrganizador = listaOrganizador;
        this.listaElementoCompletario = listaElementoCompletario;
    }



    public List<Evento> getListaEvento() {
        return listaEvento;
    }

    public void setListaEvento(List<Evento> listaEvento) {
        this.listaEvento = listaEvento;
    }

    public List<Participante> getListaParticipante() {
        return listaParticipante;
    }

    public void setListaParticipante(List<Participante> listaParticipante) {
        this.listaParticipante = listaParticipante;
    }

    public List<Organizador> getListaOrganizador() {
        return listaOrganizador;
    }

    public void setListaOrganizador(List<Organizador> listaOrganizador) {
        this.listaOrganizador = listaOrganizador;
    }

    public List<ElementoCompletario> getListaElementoCompletario() {
        return listaElementoCompletario;
    }

    public void setListaElementoCompletario(List<ElementoCompletario> listaElementoCompletario) {
        this.listaElementoCompletario = listaElementoCompletario;
    }
}
