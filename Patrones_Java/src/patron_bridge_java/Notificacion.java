package patron_bridge_java;

abstract class Notificacion {
    protected EnvioNotificacion envio; // referencia del objeto EnvioNotificacion

    public Notificacion(EnvioNotificacion envio) {
        this.envio = envio;
    }

    //Metodo abstracto que sera implementado por las clases que extiendan la abstraccion
    public abstract void notificar(String mensaje);
}
