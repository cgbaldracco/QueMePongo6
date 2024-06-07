package ar.edu.utn.frba.dds.queMePongo.notificadores;

public class EnviadorDeMails {
  private static MailSender mailSender;

  public static MailSender obtenerEnviadorDeMails() {
    return mailSender;
  }

  public void setEnviadorDeMails(MailSender mailSender) {
    EnviadorDeMails.mailSender = mailSender;
  }

  public static void enviarMail(Mail mail) {
    mailSender.send(mail.getDestinatario(), mail.getMensaje());
  }
}
