package patron_bridge_java;
// clase que implementa la interfaz EnvioNotificacion
class EnvioMensajeTexto implements EnvioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando el mensaje de texto: " + mensaje);
    }
}
