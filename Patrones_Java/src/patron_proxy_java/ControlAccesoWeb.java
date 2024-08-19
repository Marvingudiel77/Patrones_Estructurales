package patron_proxy_java;

// Clase para controlar el acceso de los usuarios
public class ControlAccesoWeb implements SitioWeb {
    //definimos variables que almacenan instancias de accesoSitioWeb
    private AccesoSitioWeb accesositioweb;
    private String usuario;

    //Constructor
    public ControlAccesoWeb(String usuario) {
        this.usuario = usuario;
        this.accesositioweb = new AccesoSitioWeb();
    }

    // Metodo que verifica si el usuario esta registrado
    public void acceder() {
        if (usuario.equals("usuarioRegistrado")) {
            accesositioweb.acceder();
        } else {
            System.out.println("Acceso denegado. Solo usuarios registrados pueden acceder.");
        }
    }

}
