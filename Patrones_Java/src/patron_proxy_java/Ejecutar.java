package patron_proxy_java;

public class Ejecutar {
    public static void main(String Args[]) {
        //Intentantamos acceder con un usuario no registrado

        //creando la instancia como invitado
        SitioWeb sitio = new ControlAccesoWeb("invitado");
        sitio.acceder(); // No permite el acceso

        System.out.println();

        // Intentantamos acceder con un usuario registrado
        // creando la instancia como usuario registrado
        SitioWeb sitioRegistrado = new ControlAccesoWeb("usuarioRegistrado");
        sitioRegistrado.acceder();//permite el acceso
    }
}