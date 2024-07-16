public class App {
    public static void main(String[] args) {
        // Instanciando Cliente
        Cliente cliente1 = new Cliente(1, "João Silva", "joao@example.com", "Rua A, 123");

        // Instanciando Produto
        Produto produto1 = new Produto(1, "Notebook", 3000.00, 10);
        Produto produto2 = new Produto(2, "Mouse", 50.00, 100);

        // Instanciando Pedido
        Pedido pedido1 = new Pedido(1, cliente1, "2024-07-15", "Processando");

        // Instanciando Rastreamento
        Rastreamento rastreamento1 = new Rastreamento(1, pedido1, "Enviado", "2024-07-16");

        // Instanciando Pagamento
        Pagamento pagamento1 = new Pagamento(1, pedido1, 3050.00, "2024-07-15", "Cartão de Crédito");

    }
}