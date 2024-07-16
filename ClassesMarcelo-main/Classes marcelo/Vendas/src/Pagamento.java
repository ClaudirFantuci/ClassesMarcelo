public class Pagamento {
    private int id;
    private Pedido pedido;
    private double valor;
    private String data;
    private String metodo;

    public Pagamento(int id, Pedido pedido, double valor, String data, String metodo) {
        this.id = id;
        this.pedido = pedido;
        this.valor = valor;
        this.data = data;
        this.metodo = metodo;
    }

}
