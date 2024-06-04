package ar.edu.utn.frba.dds.queMePongo.sugerencias;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

public abstract class MotorDeSugerencias {
  List<Prenda> prendasSuperiores = new ArrayList<>();
  List<Prenda> prendasInferiores = new ArrayList<>();
  List<Prenda> prendasCalzado = new ArrayList<>();
  List<Sugerencia> sugerencias = new ArrayList<>();

  public void separarPorCategoria(Usuario usuario) {
    prendasSuperiores = usuario.obtenerPrendasSuperiores();
    prendasInferiores = usuario.obtenerPrendasInferiores();
    prendasCalzado = usuario.obtenerPrendasCalzado();
  }

  public void generarCombinacionesDePrendas() {
    generarCombinaciones();
  }

  public void generarCombinaciones() {
    Prenda superior;
    Prenda inferior;
    Prenda calzado;
    for (int i = 0; i < prendasSuperiores.toArray().length; i++) {
      superior = prendasSuperiores.get(i);
      for (int j = 0; j < prendasInferiores.toArray().length; j++) {
        inferior = prendasInferiores.get(j);
        for (int k = 0; k < prendasCalzado.toArray().length; k++) {
          calzado = prendasCalzado.get(k);
          sugerencias.add(new Sugerencia(superior, inferior, calzado));
        }
      }
    }
  }
  public abstract List<Sugerencia> generarSugerencias(Usuario usuario);
}
