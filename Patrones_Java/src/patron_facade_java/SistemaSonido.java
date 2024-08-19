package patron_facade_java;

//Clase de sistema de sonido con sus metodos de encender y configurarVolumen
class SistemaSonido{
    public void encender() {
        System.out.println("Sistema de sonido encendido.");
    }

    public void configurarVolumen(int nivel) {
        System.out.println("Volumen configurado a: " + nivel);
    }
}
