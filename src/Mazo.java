import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        this.cartas = new ArrayList<>();
        inicializarCartas(); // Método para agregar cartas al mazo
    }

    private void inicializarCartas() {
        // Agrega cartas al mazo (ejemplo básico) Habria que hacer los palos como clases
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        for (String palo : palos) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public List<Carta> repartir(int cantidad) {
        Collections.shuffle(cartas); // Mezcla las cartas antes de repartir
        return new ArrayList<>(cartas.subList(0, cantidad));
    }

    public int tamaño() {
        return cartas.size();
    }
}
