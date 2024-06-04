package ar.edu.utn.frba.dds.queMePongo.guardarropas;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgregarPrendaGuardarropas implements SugerenciaGuardarropas {
  private Prenda prendaAAgregar;
  private EstadoSugerenciaGuardarropas estado;

  public AgregarPrendaGuardarropas(Prenda prendaAAgregar, EstadoSugerenciaGuardarropas estado) {
    this.prendaAAgregar = prendaAAgregar;
    this.estado = estado;
  }

  @Override
  public void aceptarSugerencia(Guardarropas guardarropas) {
    guardarropas.agregar(prendaAAgregar);
    estado = EstadoSugerenciaGuardarropas.ACEPTADA;
  }

  @Override
  public void revertarSugerencia(Guardarropas guardarropas) {
    guardarropas.quitar(prendaAAgregar);
    estado = EstadoSugerenciaGuardarropas.PENDIENTE;
  }
}
