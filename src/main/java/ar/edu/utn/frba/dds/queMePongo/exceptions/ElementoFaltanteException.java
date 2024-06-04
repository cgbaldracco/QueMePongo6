package ar.edu.utn.frba.dds.queMePongo.exceptions;

public class ElementoFaltanteException extends RuntimeException {
  public ElementoFaltanteException(String causa) {
    super(causa);
  }
}
