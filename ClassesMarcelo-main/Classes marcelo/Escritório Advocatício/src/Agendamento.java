import java.util.Date;

public class Agendamento {
    private int id;
    private Date data;
    private String descricao;
    private Cliente cliente;
    private Advogado advogado;

    public Agendamento(int id, Date data, String descricao, Cliente cliente, Advogado advogado) {
        this.id = id;
        this.data = data;
        this.descricao = descricao;
        this.cliente = cliente;
        this.advogado = advogado;
    }

}