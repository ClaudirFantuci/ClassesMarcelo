public class Reserva {
    public Quarto quarto;
    public String dataCheckIn;
    public String dataCheckOut;
    public String hospedeNome;

    public Reserva(Quarto quarto, String dataCheckIn, String dataCheckOut, String hospedeNome) {
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.hospedeNome = hospedeNome;
    }
}
