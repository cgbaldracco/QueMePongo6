package ar.edu.utn.frba.dds.queMePongo.notificadores;

import ar.edu.utn.frba.dds.queMePongo.Usuario;

public class Notificacion implements Notificador {

  @Override
  public void enviarMensaje(Usuario usuario, String mensaje) {
    EnviadorDeNotificaciones.enviarNotificacion(mensaje);
  }
}
