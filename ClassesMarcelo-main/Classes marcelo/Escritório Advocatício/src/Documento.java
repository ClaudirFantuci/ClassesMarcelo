public class Documento {
    private int id;
    private String titulo;
    private String conteudo;
    private Processo processo;

    public Documento(int id, String titulo, String conteudo, Processo processo) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.processo = processo;
    }

}
