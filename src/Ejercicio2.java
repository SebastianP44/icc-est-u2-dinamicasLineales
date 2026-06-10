import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio2 {

    public boolean esPalindromo(String texto){

        Deque <Character> pila = new ArrayDeque<>();

        for (char letra : texto.toCharArray()){
            pila.push(letra);
        }
        

        String invertido = "" ;

        while (!pila.isEmpty()){
            invertido += pila.pop();
        }

        return texto.equals(invertido);
    }

}