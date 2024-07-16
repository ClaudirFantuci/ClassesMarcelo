public class Voo {
    public String companhiaAerea;
    public String origem;
    public String destino;
    public String horarioPartida;
    public String horarioChegada;
    public double preco;

    public Voo(String companhiaAerea, String origem, String destino, String horarioPartida, String horarioChegada,
            double preco) {
        this.companhiaAerea = companhiaAerea;
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.preco = preco;
    }
}
