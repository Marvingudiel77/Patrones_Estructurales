package patron_diseño_composite;

public class Ejecutar {
    public static void main(String Args[]){

        // Creando las instancias de archivo
        Componente archivo1 = new Archivo("Documento.txt");
        Componente archivo2 = new Archivo("Imagen.png");

        // Crear las instancias de carpeta
        Carpeta carpeta1 = new Carpeta("Carpeta de Documentos");
        Carpeta carpeta2 = new Carpeta("Carpeta Principal");

        // Agregando el archivo1 a la carpeta de documentos
        carpeta1.agregarComponente(archivo1);

        // Agregamos la carpeta de documentos y el archivo2 a la carpeta principal
        carpeta2.agregarComponente(carpeta1);
        carpeta2.agregarComponente(archivo2);

        // Mostrar los detalles de las carpetas y archivos
        carpeta2.mostrarDetalles();
    }
}
