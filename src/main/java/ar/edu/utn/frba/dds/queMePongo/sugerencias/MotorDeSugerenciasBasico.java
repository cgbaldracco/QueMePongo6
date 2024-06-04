package ar.edu.utn.frba.dds.queMePongo.sugerencias;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import java.util.List;

public class MotorDeSugerenciasBasico extends MotorDeSugerencias {
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    separarPorCategoria(usuario);
    generarCombinacionesDePrendas();
    return sugerencias;
  }
}
