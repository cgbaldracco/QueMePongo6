package ar.edu.utn.frba.dds.queMePongo.exceptions;

public class TipoPrendaInvalidoException extends RuntimeException{
  public TipoPrendaInvalidoException(String causa) {
    super(causa);
  }
}
