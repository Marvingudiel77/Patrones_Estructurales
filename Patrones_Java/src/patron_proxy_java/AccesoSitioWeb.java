package patron_proxy_java;

//Clase que contiene metodo que solo las personas registradas podran ver
public class AccesoSitioWeb implements SitioWeb {
    public void acceder() {
        System.out.println("Accediendo al sitio web...");
    }
}

