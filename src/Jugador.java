import java.util.List;

public class Jugador {
    private Mazo mazo;
    private int puntaje;

    public Jugador() {
        this.mazo = new Mazo();
        this.puntaje = 0;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public List<Carta> repartirCartas(int cantidad) {
        return mazo.repartir(cantidad);
    }

    public boolean jugarMano(List<Carta> mano) {
        int puntajeMano = calcularPuntaje(mano);
        this.puntaje += puntajeMano;
        return puntajeMano > 0;
    }

    private int calcularPuntaje(List<Carta> mano) {
        int puntaje = 0;
        for (Carta carta : mano) {
            puntaje += carta.calcularPuntaje();
        }
        return puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
