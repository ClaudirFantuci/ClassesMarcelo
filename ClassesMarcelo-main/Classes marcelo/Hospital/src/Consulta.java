public class Consulta {
    public Paciente paciente;
    public Medico medico;
    public String dataConsulta;

    public Consulta(Paciente paciente, Medico medico, String dataConsulta) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataConsulta = dataConsulta;
    }
}
