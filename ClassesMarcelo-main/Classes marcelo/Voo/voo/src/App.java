import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("João Silva", "joao.silva@gmail.com", "1111-1111");

        Voo voo = new Voo("Companhia Aérea Gol", "São Paulo", "Rio de Janeiro", "10:00", "11:00", 299.99);

        Assento assento1 = new Assento("1A", "Econômica");
        Assento assento2 = new Assento("1B", "Econômica");

        ServicoExtra bagagem = new ServicoExtra("Bagagem Despachada", 50.00);
        ServicoExtra refeicao = new ServicoExtra("Refeição a Bordo", 30.00);

        Reserva reserva = new Reserva(usuario, voo, assento1, bagagem, "CONF12345");
    }
}
