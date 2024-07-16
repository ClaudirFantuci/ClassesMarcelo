public class Pedido {
    private int id;
    private Cliente cliente;
    private String data;
    private String status;

    public Pedido(int id, Cliente cliente, String data, String status) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.status = status;
    }

}
