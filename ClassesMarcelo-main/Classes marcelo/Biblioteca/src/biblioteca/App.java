package biblioteca;

public class App {
	public static void main(String[] args) {
		// Instanciando objetos conforme o exemplo fornecido
		Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", "Editora A", "Ficção");
		Aluno aluno1 = new Aluno("João Silva", "20230001111", "123.456.789-00", "Rua xxx, 1");
		Aluno aluno2 = new Aluno("Maria Souza", "20230002222", "987.654.321-00", "Rua yyy, 2");
		Professor professor1 = new Professor("José Oliveira", "111.222.333-44", "Literatura");
		Emprestimo emprestimo1 = new Emprestimo(livro1, aluno1, "07-06-2024", "06-07-2024");
		Reserva reserva1 = new Reserva(livro1, aluno2, "07-07-2024");

	}
}
