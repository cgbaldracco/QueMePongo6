package ar.edu.utn.frba.dds.queMePongo.exceptions;

public class TramaInvalidaException extends RuntimeException{
  public TramaInvalidaException(String causa) {
    super(causa);
  }
}
