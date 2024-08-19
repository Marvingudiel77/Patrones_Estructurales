package patron_diseño_composite;
// implementando la interfaz componente
class Archivo implements Componente {
    private String nombre;

//Constructor
    public Archivo(String nombre) {
        this.nombre = nombre;
    }

//implementacion del metodo mostrarDetalles de la interfaz
    @Override
    public void mostrarDetalles() {
        System.out.println("Archivo: " + nombre);
    }
}
