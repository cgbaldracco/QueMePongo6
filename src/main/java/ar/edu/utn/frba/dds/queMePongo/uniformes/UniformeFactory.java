package ar.edu.utn.frba.dds.queMePongo.uniformes;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;

public interface UniformeFactory {
  public Prenda fabricarParteSuperior();
  public Prenda fabricarParteInferior();
  public Prenda fabricarCalzado();
}
