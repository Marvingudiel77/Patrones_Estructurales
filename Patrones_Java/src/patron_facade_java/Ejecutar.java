package patron_facade_java;

public class Ejecutar {
    public static void main (String Args[]){

        // instancias de los subsistemas
        Television tv = new Television();
        ReproductorDVD dvd = new ReproductorDVD();
        SistemaSonido sonido = new SistemaSonido();

        // instancia que contiene las instancias de los subsistemas
        CineEnCasa cineEnCasa = new CineEnCasa(tv, dvd, sonido);

        //llamamos al metodo verPelicula que cuenta con todas las operaciones necesarias de un cine en casa
        cineEnCasa.verPelicula();
    }
}
