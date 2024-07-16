public class Reserva {
    public Usuario usuario;
    public Voo voo;
    public Assento assento;
    public ServicoExtra servicoExtra;
    public String codigoConfirmacao;

    public Reserva(Usuario usuario, Voo voo, Assento assento, ServicoExtra servicoExtra, String codigoConfirmacao) {
        this.usuario = usuario;
        this.voo = voo;
        this.assento = assento;
        this.servicoExtra = servicoExtra;
        this.codigoConfirmacao = codigoConfirmacao;
    }
}