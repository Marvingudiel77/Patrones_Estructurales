package patron_bridge_java;

//Extiende de la clase abstracta Notificacion
class NotificacionAltaPrioridad extends Notificacion {
    public NotificacionAltaPrioridad(EnvioNotificacion envio) {
        super(envio);
    }

    //Añadimos comportamieto al metodo abstracto
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación de alta prioridad:");
        envio.enviar(mensaje);
    }
}