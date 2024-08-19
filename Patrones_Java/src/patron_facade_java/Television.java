package patron_facade_java;

// clase television con sus metodos de encender y configurarEntrada
class Television {
    public void encender() {
        System.out.println("Televisión encendida.");
    }

    public void configurarEntrada(String fuente) {
        System.out.println("Entrada de la televisión configurada a: " + fuente);
    }
}
