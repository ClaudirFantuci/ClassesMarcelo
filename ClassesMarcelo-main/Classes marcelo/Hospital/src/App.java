public class App {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Maria Silva", 35, "Feminino");
        Medico medico1 = new Medico("Dr. João Santos", "Cardiologia", "12345");
        Consulta consulta1 = new Consulta(paciente1, medico1, "2024-07-15");
        Exame exame1 = new Exame("Raio-X", paciente1, "2024-07-16");
        Leito leito1 = new Leito(101, true);
    }
}