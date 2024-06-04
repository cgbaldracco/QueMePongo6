package ar.edu.utn.frba.dds.queMePongo.exceptions;

public class FalloConeccionConApiException extends RuntimeException {
  public FalloConeccionConApiException(String causa) {
    super(causa);
  }
}
