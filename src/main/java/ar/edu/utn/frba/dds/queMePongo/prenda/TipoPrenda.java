package ar.edu.utn.frba.dds.queMePongo.prenda;

import java.math.BigDecimal;

public class TipoPrenda {
  private Categoria categoria;
  private BigDecimal aptaHastaTemperatura;

  public TipoPrenda(Categoria categoria, BigDecimal temperaturaMaxima) {
    this.categoria = categoria;
    this.aptaHastaTemperatura = temperaturaMaxima;
  }

  public static TipoPrenda REMERA = new TipoPrenda(Categoria.PARTE_SUPERIOR, new BigDecimal(35));
  public static TipoPrenda PANTALON = new TipoPrenda(Categoria.PARTE_INFERIOR, new BigDecimal(30));
  public static TipoPrenda BUZO = new TipoPrenda(Categoria.PARTE_SUPERIOR, new BigDecimal(25));
  public static TipoPrenda CAMPERA = new TipoPrenda(Categoria.ABRIGO, new BigDecimal(20));
  public static TipoPrenda ZAPATOS = new TipoPrenda(Categoria.CALZADO, new BigDecimal(30));
  public static TipoPrenda ZAPATILLAS = new TipoPrenda(Categoria.CALZADO, new BigDecimal(30));
  public static TipoPrenda BLUSA = new TipoPrenda(Categoria.PARTE_SUPERIOR, new BigDecimal(35));
  public static TipoPrenda SHORT = new TipoPrenda(Categoria.PARTE_INFERIOR, new BigDecimal(35));
  public static TipoPrenda MALLA = new TipoPrenda(Categoria.PARTE_INFERIOR, new BigDecimal(40));
  public static TipoPrenda SANDALIAS = new TipoPrenda(Categoria.CALZADO, new BigDecimal(40));
  public static TipoPrenda AROS = new TipoPrenda(Categoria.ACCESORIO, new BigDecimal(40));
  public static TipoPrenda CHOMBA = new TipoPrenda(Categoria.PARTE_SUPERIOR, new BigDecimal(30));
  public static TipoPrenda CAMISA = new TipoPrenda(Categoria.PARTE_SUPERIOR, new BigDecimal(30));
  public static TipoPrenda PANTALON_DE_VESTIR = new TipoPrenda(Categoria.CALZADO, new BigDecimal(20));

  public Categoria obtenerCategoria() {
    return this.categoria;
  }
  public BigDecimal obtenerTemperaturaMaxima() { return this.aptaHastaTemperatura; }
}