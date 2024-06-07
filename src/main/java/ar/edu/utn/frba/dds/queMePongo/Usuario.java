package ar.edu.utn.frba.dds.queMePongo;

import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import ar.edu.utn.frba.dds.queMePongo.prenda.Categoria;
import ar.edu.utn.frba.dds.queMePongo.servicioMeteorologico.AlertaMeteorologica;
import ar.edu.utn.frba.dds.queMePongo.accionesSobreAlertas.AccionConfigurable;
import ar.edu.utn.frba.dds.queMePongo.sugerencias.MotorDeSugerencias;
import ar.edu.utn.frba.dds.queMePongo.sugerencias.Sugerencia;
import ar.edu.utn.frba.dds.queMePongo.sugerencias.SugerenciaDiaria;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private List<Prenda> prendas = new ArrayList<>();
  private Integer edad;
  private MotorDeSugerencias motorDeSugerencias;
  private SugerenciaDiaria sugerenciaDiaria;
  private List<AccionConfigurable> accionesAnteAlertas;
  private String correo;

  public Usuario(Integer edad, MotorDeSugerencias motorDeSugerencias) {
    this.edad = edad;
    this.motorDeSugerencias = motorDeSugerencias;
  }

  public SugerenciaDiaria getSugerenciaDiaria() {
    return sugerenciaDiaria;
  }

  public void calcularSugerenciaDiaria() {
    this.sugerenciaDiaria = new SugerenciaDiaria(generarSugerencias());
  }

  public MotorDeSugerencias obtenerMotor() {
    return motorDeSugerencias;
  }

  public void setMotor(MotorDeSugerencias motor) {
    this.motorDeSugerencias = motor;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public List<Sugerencia> generarSugerencias() {
    return motorDeSugerencias.generarSugerencias(this);
  }

  public List<Prenda> obtenerPrendasSuperiores() {
    return prendas.stream().filter(prenda -> prenda.obtenerCategoria() == Categoria.PARTE_SUPERIOR).toList();
  }

  public List<Prenda> obtenerPrendasInferiores() {
    return prendas.stream().filter(prenda -> prenda.obtenerCategoria() == Categoria.PARTE_INFERIOR).toList();
  }

  public List<Prenda> obtenerPrendasCalzado() {
    return prendas.stream().filter(prenda -> prenda.obtenerCategoria() == Categoria.CALZADO).toList();
  }

  public Integer obtenerEdad() {
    return getEdad();
  }

  private Integer getEdad() {
    return edad;
  }

  public List<Prenda> obtenerPrendas() {
    return prendas;
  }

  public void agregarAccionAnteAlerta(AccionConfigurable accionConfigurable) {
    accionesAnteAlertas.add(accionConfigurable);
  }

  public void quitarAccionAnteAlerta(AccionConfigurable accionConfigurable) {
    accionesAnteAlertas.remove(accionConfigurable);
  }

  public void realizarAccionesSobreAlertas(List<AlertaMeteorologica> ultimasAlertas) {
    accionesAnteAlertas.forEach(accion -> accion.accionarSobreNuevasAlertasMeteorologicas(this, ultimasAlertas));
  }

  public void notificar(String mensaje) {
    System.out.println(mensaje);
  }

  public String getMail() {
    return correo;
  }
}

