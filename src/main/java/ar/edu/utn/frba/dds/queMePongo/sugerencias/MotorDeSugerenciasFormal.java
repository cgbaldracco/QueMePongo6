package ar.edu.utn.frba.dds.queMePongo.sugerencias;

import ar.edu.utn.frba.dds.queMePongo.prenda.Formalidad;
import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import ar.edu.utn.frba.dds.queMePongo.Usuario;
import java.util.List;

public class MotorDeSugerenciasFormal extends MotorDeSugerencias {
  public List<Sugerencia> generarSugerencias(Usuario usuario) {
    separarPorCategoria(usuario);
    obtenerPrendasValidasParaMotor(usuario);
    generarCombinacionesDePrendas();
    return sugerencias;
  }

  private void obtenerPrendasValidasParaMotor(Usuario usuario) {
    prendasSuperiores = obtenerPrendasValidas(usuario.obtenerEdad(), prendasSuperiores);
    prendasInferiores = obtenerPrendasValidas(usuario.obtenerEdad(), prendasInferiores);
    prendasCalzado = obtenerPrendasValidas(usuario.obtenerEdad(), prendasCalzado);
  }

  List<Prenda> obtenerPrendasValidas(Integer edad, List<Prenda> prendas){
    return edad > 55 ? prendas.stream().filter(prenda ->
        !(prenda.obtenerFormalidad() == Formalidad.INFORMAL)).toList() : prendas;
  }
}
