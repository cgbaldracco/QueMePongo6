package ar.edu.utn.frba.dds.queMePongo.uniformes;

import ar.edu.utn.frba.dds.queMePongo.prenda.Color;
import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import ar.edu.utn.frba.dds.queMePongo.prenda.TipoPrenda;
import ar.edu.utn.frba.dds.queMePongo.prenda.Trama;
import ar.edu.utn.frba.dds.queMePongo.prenda.Borrador;
import ar.edu.utn.frba.dds.queMePongo.prenda.Material;



public class UniformeInstitutoJhonson implements UniformeFactory {
  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoPrenda.CAMISA);
    borrador.especificarColorPrimario(new Color(255, 255, 255));
    borrador.especificarMaterial(Material.TELA);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoPrenda.PANTALON_DE_VESTIR);
    borrador.especificarColorPrimario(new Color(0, 0, 0));
    borrador.especificarMaterial(Material.TELA);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }

  public Prenda fabricarCalzado() {
    Borrador borrador = new Borrador(TipoPrenda.ZAPATOS);
    borrador.especificarColorPrimario(new Color(0, 0, 0));
    borrador.especificarMaterial(Material.CUERO);
    borrador.especificarTrama(Trama.LISA);
    return borrador.crearPrenda();
  }
}
