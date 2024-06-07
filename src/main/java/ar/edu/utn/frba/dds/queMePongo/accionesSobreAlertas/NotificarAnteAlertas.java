package ar.edu.utn.frba.dds.queMePongo.accionesSobreAlertas;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.notificadores.Notificacion;
import ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico.AlertaMeteorologica;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificarAnteAlertas implements AccionConfigurable {
  private static Map<Object, String> mensajes;

  public void setUpMensajes() {
    mensajes = new HashMap<>();
    mensajes.put(AlertaMeteorologica.GRANIZO, "No salgas en auto.");
    mensajes.put(AlertaMeteorologica.TORMENTA, "Lleva paraguas.");
  }

  @Override
  public void accionarSobreNuevasAlertasMeteorologicas(Usuario usuario, List<AlertaMeteorologica> alertas) {
    Notificacion notificacion = new Notificacion();
    alertas.forEach(a -> notificacion.enviarMensaje(usuario, mensajes.get(a)));
  }
}
