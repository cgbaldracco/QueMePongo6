package ar.edu.utn.frba.dds.queMePongo.sugerencias;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import java.math.BigDecimal;

public class Sugerencia {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda prendaCalzado;

  public Sugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.prendaCalzado = prendaCalzado;
  }

  public Boolean aptaParaTemperatura(BigDecimal temperatura) {
    return prendaSuperior.aptaParaTemperatura(temperatura) && prendaInferior.aptaParaTemperatura(temperatura) &&
        prendaCalzado.aptaParaTemperatura(temperatura);
  }

  public Boolean aptaParaHumedad(Humedad humedad) {
    return prendaSuperior.aptaParaHumedad(humedad) && prendaInferior.aptaParaHumedad(humedad) &&
        prendaCalzado.aptaParaHumedad(humedad);
  }
}
