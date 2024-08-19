package patron_bridge_java;
// clase que implementa la interfaz EnvioNotificacion
class EnvioEmail implements EnvioNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando el email: " + mensaje);
    }
}
