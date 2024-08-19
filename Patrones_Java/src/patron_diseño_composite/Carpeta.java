package patron_diseño_composite;
import java.util.ArrayList;
import java.util.List;

// implementando la interfaz componente
class Carpeta implements Componente {
    private String nombre;

//Creacion de la lista llamada componentes que almacenara los archivos y carpetas creadas
    private List<Componente> componentes = new ArrayList<>();

 //cosntructor
    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
//metodo para agregar archivos o carpetas a la lista componentes
    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

 //Metodo que imprime el nombre de la carpeta y recorre cada elemento mostrando los detalles de cada elemento
    @Override
    public void mostrarDetalles() {
        System.out.println("Carpeta: " + nombre);
        for (Componente componente : componentes) {
            componente.mostrarDetalles();
        }
    }
}
