package ar.edu.utn.frba.dds.queMePongo.exceptions;

public class MaterialInvalidoException extends RuntimeException{
  public MaterialInvalidoException(String causa) {
    super(causa);
  }
}
