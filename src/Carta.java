public class Carta {
    private String palo;
    private int valor;
    private int multiplicador;

    public Carta(String palo, int valor) {
        this.palo = palo;
        this.valor = valor;
        this.multiplicador = 1; // Multiplicador por defecto
    }

    public int getValor() {
        return valor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void aplicarTarotPuntos(int nuevoValor) {
        this.valor = nuevoValor;
    }

    public void aplicarTarotMultiplicador(int nuevoMultiplicador) {
        this.multiplicador = nuevoMultiplicador;
    }

    public int calcularPuntaje() {
        return valor * multiplicador;
    }
}
