package ar.edu.utn.frba.dds.queMePongo.notificadores;

public class Mail {
  private String destinatario;
  private String mensaje;

  public Mail(String destinatario, String mensaje) {
    this.destinatario = destinatario;
    this.mensaje = mensaje;
  }

  public String getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }
}
