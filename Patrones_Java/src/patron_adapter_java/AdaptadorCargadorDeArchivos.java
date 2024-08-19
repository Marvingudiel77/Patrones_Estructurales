package patron_adapter_java;

class AdaptadorCargadorDeArchivos implements CargadorDeArchivosTxt {
    // variable que almacena instancia de CargadorDeArchivosPdf
    private CargadorDeArchivosPdf cargadorPdf;

    //constructor
    public AdaptadorCargadorDeArchivos(CargadorDeArchivosPdf cargadorPdf) {
        this.cargadorPdf = cargadorPdf;
    }

    public void cargarArchivoTxt(String archivo) {
        //simulamos convertir el archivo txt a pdf
        System.out.println("Convertiendo archivo .txt a .pdf...");
        cargadorPdf.cargarArchivoPdf(archivo + ".pdf");
    }
}
