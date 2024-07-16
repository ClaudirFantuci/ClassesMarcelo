import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Instanciando Cliente
        Cliente cliente1 = new Cliente(1, "João Silva", "Rua 123", "99999-9999", "joao@gmail.com");

        // Instanciando Advogado
        Advogado advogado1 = new Advogado(1, "Maria Silva", "123456", "Direito Civil");

        // Instanciando Processo
        Processo processo1 = new Processo(1, "Cobrança", "Em andamento", cliente1, advogado1);

        // Instanciando Documento
        Documento documento1 = new Documento(1, "Petição Inicial", "Conteúdo da petição", processo1);

        // Instanciando Agendamento
        Agendamento agendamento1 = new Agendamento(1, new Date(), "Reunião com cliente", cliente1, advogado1);

    }
}