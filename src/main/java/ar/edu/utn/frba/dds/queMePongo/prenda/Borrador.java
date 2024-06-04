package ar.edu.utn.frba.dds.queMePongo.prenda;

import ar.edu.utn.frba.dds.queMePongo.exceptions.ColorInvalidoException;
import ar.edu.utn.frba.dds.queMePongo.exceptions.TipoPrendaInvalidoException;
import ar.edu.utn.frba.dds.queMePongo.exceptions.TramaInvalidaException;
import ar.edu.utn.frba.dds.queMePongo.exceptions.MaterialInvalidoException;

public class Borrador {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario = null;
  private Trama trama = Trama.LISA;

  public Borrador(TipoPrenda tipoPrenda) {
    if(tipoPrenda == null) {
      throw new TipoPrendaInvalidoException("El tipo de prenda ingresado no es correcto");
    }
    this.tipoPrenda = tipoPrenda;
  }

  public Prenda crearPrenda() {
    Prenda prenda = new Prenda(tipoPrenda, material, colorPrimario, trama);
    if (colorSecundario != null) {
      prenda.indicarColorSecundario(colorSecundario);
    }
    return prenda;
  }

  public void especificarMaterial(Material material) {
    if(material == null) {
      throw new MaterialInvalidoException("El material ingresado no es correcto");
    }
    setMaterial(material);
  }

  public void especificarColorPrimario(Color colorPrimario) {
    if(colorPrimario == null) {
      throw new ColorInvalidoException("El color primario ingresado no es correcto");
    }
    setColorPrimario(colorPrimario);
  }

  public void especificarColorSecundario(Color colorSecundario) {
    if(colorSecundario == null) {
      throw new ColorInvalidoException("El color secundario ingresado no es correcto");
    }
    setColorSecundario(colorSecundario);
  }

  public void especificarTrama(Trama trama) {
    if(trama == null) {
      throw new TramaInvalidaException("La trama ingresada no es correcta");
    }
    setTrama(trama);
  }

  private void setMaterial(Material material) {
    this.material = material;
  }

  private void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  private void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  private void setTrama(Trama trama) {
    this.trama = trama;
  }
}
