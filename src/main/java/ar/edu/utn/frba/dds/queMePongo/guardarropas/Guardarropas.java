package ar.edu.utn.frba.dds.queMePongo.guardarropas;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import java.util.List;

public class Guardarropas {
  private Usuario duenio;
  private String criterio;
  private List<Prenda> prendas;
  private List<SugerenciaGuardarropas> sugerenciasGuardarropas;

  public Guardarropas(Usuario duenio, String criterio, List<Prenda> prendas, List<SugerenciaGuardarropas> sugerenciasGuardarropas) {
    this.duenio = duenio;
    this.criterio = criterio;
    this.prendas = prendas;
    this.sugerenciasGuardarropas = sugerenciasGuardarropas;
  }

  public void agregar(Prenda prenda) {
    prendas.add(prenda);
  }

  public void quitar(Prenda prenda) {
    prendas.remove(prenda);
  }

  public void agregarSugerencia(SugerenciaGuardarropas sugerenciaGuardarropas) {
    sugerenciasGuardarropas.add(sugerenciaGuardarropas);
  }

  public void quitarSugerencia(SugerenciaGuardarropas sugerenciaGuardarropas) {
    sugerenciasGuardarropas.remove(sugerenciaGuardarropas);
  }
}
