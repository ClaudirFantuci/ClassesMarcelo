public class App {
    public static void main(String[] args) {
        // Instanciando objetos conforme o exemplo fornecido
        Quarto quarto1 = new Quarto(101, false, 300.0);
        Reserva reserva1 = new Reserva(quarto1, "2024-08-01", "2024-08-05", "João Silva");
        Hospede hospede1 = new Hospede("João Silva", "11111111111", "(44) 1111-1111", "joao.silva@example.com");
        Servico servico1 = new Servico("Serviço de Quarto", "Refeição", 50.0);
        Funcionario funcionario1 = new Funcionario("Maria Souza", "Recepcionista", 2500.0);
    }
}
