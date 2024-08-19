package patron_bridge_java;

public class Ejecutar {
    public static void main(String Args[]){
        //Creamos los tipos de envios
        EnvioNotificacion mensajeTexto = new EnvioMensajeTexto();
        EnvioNotificacion email = new EnvioEmail();
        //Creamos las distintas notificaciones
        Notificacion altaPrioridadTexto = new NotificacionAltaPrioridad(mensajeTexto);
        Notificacion bajaPrioridadEmail = new NotificacionBajaPrioridad(email);
        //Enviamos las notificaciones.
        altaPrioridadTexto.notificar("¡Esta es una alerta importante!");
        bajaPrioridadEmail.notificar("Recordatorio de la reunión de mañana");
    }
}
