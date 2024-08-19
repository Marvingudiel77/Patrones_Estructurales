package patron_flyweight_java;
import java.util.HashMap;
import java.util.Map; //se usan para almacenar y gestionar objetos

public class GestionCaracteres {
    //creacion de un mapa que se asocia al caracter para reutilizar las instancias de caracter
    private Map<Character, Caracter> caracteres = new HashMap<>();

    public Caracter getCaracter(char simbolo) {
        // Si el carácter ya existe, lo devuelve, sino lo crea y lo guarda
        if (!caracteres.containsKey(simbolo)) {
            caracteres.put(simbolo, new Caracter(simbolo));
        }
        //devuelve la instancia del caracter que pedimos
        return caracteres.get(simbolo);
    }
}
