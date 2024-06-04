package ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.sugerencias.Sugerencia;
import java.util.List;

public class GeneradorDeSugerencias {
  private ServicioMeteorologico servicioMeteorologico;

  public GeneradorDeSugerencias(ServicioMeteorologico servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Sugerencia sugerirAtuendo(String direccion, Usuario usuario) {
    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico.obtenerCondicionesClimaticas(direccion);
    List<Sugerencia> combinaciones = usuario.obtenerMotor().generarSugerencias(usuario);
    return combinaciones
        .stream()
        .filter(combinacion -> combinacion.aptaParaTemperatura(estadoDelTiempo.temperatura()))
        .findFirst()
        .get();

  }
}
