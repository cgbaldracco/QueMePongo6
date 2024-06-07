package ar.edu.utn.frba.dds.queMePongo.notificadores;

import ar.edu.utn.frba.dds.queMePongo.Usuario;

public class Correo implements Notificador {

  @Override
  public void enviarMensaje(Usuario usuario, String mensaje) {
    EnviadorDeMails.enviarMail(new Mail(usuario.getMail(), mensaje));
  }
}
