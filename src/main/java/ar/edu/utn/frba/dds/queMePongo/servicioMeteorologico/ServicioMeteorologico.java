package ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico;

public interface ServicioMeteorologico {
  EstadoDelTiempo obtenerCondicionesClimaticas(String direccion);
}
