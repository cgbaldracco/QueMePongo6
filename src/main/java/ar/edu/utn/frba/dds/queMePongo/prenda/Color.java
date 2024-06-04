package ar.edu.utn.frba.dds.queMePongo.prenda;

import ar.edu.utn.frba.dds.queMePongo.exceptions.ColorInvalidoException;

public class Color {
  Integer rojo, verde, azul;

    public Color(Integer rojo, Integer verde, Integer azul) {
    if (rojo < 0 || rojo > 255 || verde < 0 || verde > 255 || azul < 0 || azul > 255) {
      throw new ColorInvalidoException("COLOR INVALIDO: Los colores deben estar " +
          "compuestos por un rgb, sus valores deben estar entre 0 y 255");
    }
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }
}