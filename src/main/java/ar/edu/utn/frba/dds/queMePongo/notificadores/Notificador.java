package ar.edu.utn.frba.dds.queMePongo.notificadores;

import ar.edu.utn.frba.dds.queMePongo.Usuario;

public interface Notificador {
  void enviarMensaje(Usuario usuario, String mensaje);
}
