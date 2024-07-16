public class Rastreamento {
    private int id;
    private Pedido pedido;
    private String status;
    private String dataAtualizacao;

    public Rastreamento(int id, Pedido pedido, String status, String dataAtualizacao) {
        this.id = id;
        this.pedido = pedido;
        this.status = status;
        this.dataAtualizacao = dataAtualizacao;
    }

}