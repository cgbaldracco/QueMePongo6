package ar.edu.utn.frba.dds.queMePongo.notificadores;

public interface MailSender {
  void send(String address, String message);
}
