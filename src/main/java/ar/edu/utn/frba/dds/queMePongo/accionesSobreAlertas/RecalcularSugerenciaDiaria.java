package ar.edu.utn.frba.dds.queMePongo.accionesSobreAlertas;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico.AlertaMeteorologica;
import java.util.List;

public class RecalcularSugerenciaDiaria implements AccionConfigurable {

  @Override
  public void accionarSobreNuevasAlertasMeteorologicas(Usuario usuario, List<AlertaMeteorologica> alertas) {
    usuario.calcularSugerenciaDiaria();
  }
}
