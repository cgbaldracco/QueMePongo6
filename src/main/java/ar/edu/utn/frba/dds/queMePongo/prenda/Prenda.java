package ar.edu.utn.frba.dds.queMePongo.prenda;

import java.math.BigDecimal;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama;
  private Formalidad formalidad;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Trama trama) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.trama = trama;
  }

  public void indicarFormalidad(Formalidad formalidad) {
    setFormalidad(formalidad);
  }

  private void setFormalidad(Formalidad formalidad) {
    this.formalidad = formalidad;
  }

  public Formalidad obtenerFormalidad() {
    return getFormalidad();
  }

  public Formalidad getFormalidad() {
    return formalidad;
  }

  private TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  private Material getMaterial() {
    return material;
  }

  private Color getColorPrimario() {
    return colorPrimario;
  }

  private Color getColorSecundario() {
    return colorSecundario;
  }

  private Trama getTrama() {
    return trama;
  }

  public Trama obtenerTrama() {
    return getTrama();
  }

  public Color obtenerColorPrimario() {
    return getColorPrimario();
  }

  public Color obtenerColorSecundario() {
    return getColorSecundario();
  }

  public Material obtenerMaterial() {
    return getMaterial();
  }

  public TipoPrenda obtenerTipoPrenda() {
    return getTipoPrenda();
  }

  public void indicarColorSecundario(Color colorSecundario) {
    this.setColorSecundario(colorSecundario);
  }

  private void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Categoria obtenerCategoria() {
    return tipoPrenda.obtenerCategoria();
  }

  public Boolean aptaParaTemperatura(BigDecimal temperatura) {
    return this.tipoPrenda.obtenerTemperaturaMaxima().compareTo(temperatura) >= 0;
  }
}