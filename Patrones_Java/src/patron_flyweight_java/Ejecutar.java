package patron_flyweight_java;

public class Ejecutar {
    public static void main(String Args[]) {
        GestionCaracteres factory = new GestionCaracteres();

        // creamos los caracteres usando la gestion de caracteres
        Caracter caracter1 = factory.getCaracter('a');
        Caracter caracter2 = factory.getCaracter('b');
        Caracter caracter3 = factory.getCaracter('a'); // no se crea, se reutiliza el caracter en el mapa


        // Se muestran los caracteres
        caracter1.mostrar();
        caracter2.mostrar();
        caracter3.mostrar();
    }
}