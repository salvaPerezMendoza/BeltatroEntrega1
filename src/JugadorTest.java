import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class JugadorTest {

    @Test
    public void testJugadorPoseeCartasSuficientes() {
        Jugador jugador = new Jugador();
        assertTrue(jugador.getMazo().tamaño() >= 8, "El jugador no tiene cartas suficientes para empezar.");
    }

    @Test
    public void testRepartirOchoCartas() {
        Jugador jugador = new Jugador();
        List<Carta> mano = jugador.repartirCartas(8);
        assertEquals(8, mano.size(), "No se repartieron 8 cartas al jugador.");
    }

    @Test
    public void testJugarMano() {
        Jugador jugador = new Jugador();
        List<Carta> mano = jugador.repartirCartas(8);
        boolean seJugo = jugador.jugarMano(mano);
        assertTrue(seJugo, "No se pudo jugar la mano.");
    }

    @Test
    public void testTarotCambiaPuntos() {
        Carta carta = new Carta("Corazones", 3);
        carta.aplicarTarotPuntos(10);
        assertEquals(10, carta.getValor(), "El puntaje de la carta no fue modificado correctamente al usar el tarot.");
    }

    @Test
    public void testTarotCambiaMultiplicador01() {
        Carta carta = new Carta("Picas", 5);
        carta.aplicarTarotMultiplicador(6);
        int valor = carta.calcularPuntaje();
        int valorEsperado = 30;
        assertEquals(valorEsperado, valor, "El multiplicador de la carta no fue modificado correctamente al usar el tarot.");
    }

    @Test
    public void testTarotCambiaMultiplicador02() {
        Carta carta = new Carta("Picas", 5);
        carta.aplicarTarotMultiplicador(6);
        assertEquals(6, carta.getMultiplicador(), "El multiplicador de la carta no fue modificado correctamente al usar el tarot.");
    }
}
