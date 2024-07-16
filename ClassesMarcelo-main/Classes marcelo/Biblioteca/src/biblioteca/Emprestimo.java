package biblioteca;

public class Emprestimo {
	public Livro livro;
	public Aluno aluno;
	public String dataRetirada;
	public String dataDevolucao;

	public Emprestimo(Livro livro, Aluno aluno, String dataRetirada, String dataDevolucao) {
		this.livro = livro;
		this.aluno = aluno;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
	}
}
