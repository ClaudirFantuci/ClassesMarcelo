package biblioteca;

public class Reserva {
	public Livro livro;
	public Aluno aluno;
	public String dataReserva;

	public Reserva(Livro livro, Aluno aluno, String dataReserva) {
		this.livro = livro;
		this.aluno = aluno;
		this.dataReserva = dataReserva;
	}
}
