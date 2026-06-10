import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    /**
     * texto -> COMPUTACION
     * return -> NOICATUPMOC
     * USANDO SOLO PILAS
     */
    public String invertString(String texto) {

        Deque<Character> pila = new ArrayDeque<>();
        
        // Apilar cada letra
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";

        // Desapilar para invertir
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return invertido;
    }
}