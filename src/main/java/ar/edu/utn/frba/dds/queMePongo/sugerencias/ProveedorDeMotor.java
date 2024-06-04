package ar.edu.utn.frba.dds.queMePongo.sugerencias;

public class ProveedorDeMotor {
  private static MotorDeSugerencias motorDeSugerencias;

  public static MotorDeSugerencias obtenerMotor() {
    return motorDeSugerencias;
  }

  public void setMotor(MotorDeSugerencias motor) {
    ProveedorDeMotor.motorDeSugerencias = motor;
  }
}
