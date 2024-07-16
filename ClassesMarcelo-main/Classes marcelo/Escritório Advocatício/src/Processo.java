public class Processo {
    private int id;
    private String descricao;
    private String status;
    private Cliente cliente;
    private Advogado advogado;

    public Processo(int id, String descricao, String status, Cliente cliente, Advogado advogado) {
        this.id = id;
        this.descricao = descricao;
        this.status = status;
        this.cliente = cliente;
        this.advogado = advogado;
    }

}