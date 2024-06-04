package ar.edu.utn.frba.dds.queMePongo.uniformes;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;

public class Uniforme {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Uniforme(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
    this.prendaSuperior = parteSuperior;
    this.prendaInferior = parteInferior;
    this.calzado = calzado;
  }

  public Uniforme fabricarUniforme(UniformeFactory fabricaUniforme) {
    return new Uniforme(fabricaUniforme.fabricarParteSuperior(),
                        fabricaUniforme.fabricarParteInferior(),
                        fabricaUniforme.fabricarCalzado());
  }
}
