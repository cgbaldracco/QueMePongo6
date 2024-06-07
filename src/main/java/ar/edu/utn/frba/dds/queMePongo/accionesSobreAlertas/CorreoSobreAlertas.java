package ar.edu.utn.frba.dds.queMePongo.accionesSobreAlertas;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.notificadores.Correo;
import ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico.AlertaMeteorologica;
import java.util.List;

public class CorreoSobreAlertas implements AccionConfigurable {
  private static String cuerpo = "Te enviamos un correo para avisarte sobre las nuevas alertas! Hay alerta de:";

  @Override
  public void accionarSobreNuevasAlertasMeteorologicas(Usuario usuario, List<AlertaMeteorologica> alertas) {
    Correo correo = new Correo();
    alertas.forEach(a -> correo.enviarMensaje(usuario, cuerpo + " " + a.toString()));
  }
}
