public interface IGestionEvento {
    public void registrarParticipante(Participante participante);
    public void listarParticipantes();
    public void registrarEvento(Evento evento);
    public void listarEventos();
    public void registrarTipoEvento(TipoEvento tipoEvento);
    public void listarTipoEventos();
    public void registrarParticipanteVIP(ParticipanteVIP participanteVIP);
    public void listarParticipantesVIP();
    public void registrarParticipanteRegular(ParticipanteRegular participanteRegular);
    public void listarParticipantesRegulares();
}
