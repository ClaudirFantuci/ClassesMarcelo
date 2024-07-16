public class Exame {
    public String tipo;
    public Paciente paciente;
    public String dataPedido;

    public Exame(String tipo, Paciente paciente, String dataPedido) {
        this.tipo = tipo;
        this.paciente = paciente;
        this.dataPedido = dataPedido;
    }
}
