package patron_adapter_java;

public class Ejecutar {
    public static void main(String Args[]) {
        // Creando una instancia del cargador pdf
        CargadorDeArchivosPdf cargadorPdf = new CargadorDeArchivosPdf();

        // Crear un adaptador para usar el cargador de PDF con la interfaz de .txt
        CargadorDeArchivosTxt adaptador = new AdaptadorCargadorDeArchivos(cargadorPdf);

        // Usar el adaptador para cargar un archivo .txt
        adaptador.cargarArchivoTxt("documento"); // Debería convertirlo a PDF y cargarlo
    }
}

