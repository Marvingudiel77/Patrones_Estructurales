package patron_facade_java;

class CineEnCasa {
// creamos propiedades que almacenan referencias a las otras clases
    private Television television;
    private ReproductorDVD dvd;
    private SistemaSonido sonido;
//constructor
    public CineEnCasa(Television tv, ReproductorDVD dvd, SistemaSonido sonido) {
        this.television = tv;
        this.dvd = dvd;
        this.sonido = sonido;
    }

    // metodo para encender y configurar el sistema de la casa, llamamos a los metodos para configurarlos
    public void verPelicula() {
        television.encender();
        television.configurarEntrada("HDMI");

        dvd.encender();
        dvd.reproducir();

        sonido.encender();
        sonido.configurarVolumen(20);

        System.out.println("¡Disfruta tu película!");
    }
}