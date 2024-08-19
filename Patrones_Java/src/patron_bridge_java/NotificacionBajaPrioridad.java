package patron_bridge_java;

//Extiende de la clase abstracta Notificacion
class NotificacionBajaPrioridad extends Notificacion {
    public NotificacionBajaPrioridad(EnvioNotificacion envio) {
        super(envio);
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación de baja prioridad:");
        envio.enviar(mensaje);
    }
}
