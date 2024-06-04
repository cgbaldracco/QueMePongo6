package ar.edu.utn.frba.dds.queMePongo.guardarropas;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuitarPrendaGuardarropas implements SugerenciaGuardarropas {
  private Prenda prendaAQuitar;
  private EstadoSugerenciaGuardarropas estado;

  public QuitarPrendaGuardarropas(Prenda prendaAQuitar, EstadoSugerenciaGuardarropas estado) {
    this.prendaAQuitar = prendaAQuitar;
    this.estado = estado;
  }

  @Override
  public void aceptarSugerencia(Guardarropas guardarropas) {
    guardarropas.quitar(prendaAQuitar);
    estado = EstadoSugerenciaGuardarropas.ACEPTADA;
  }

  @Override
  public void revertarSugerencia(Guardarropas guardarropas) {
    guardarropas.agregar(prendaAQuitar);
    estado = EstadoSugerenciaGuardarropas.PENDIENTE;
  }
}
