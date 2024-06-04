package ar.edu.utn.frba.dds.queMePongo.repositorios;

import ar.edu.utn.frba.dds.queMePongo.Usuario;
import ar.edu.utn.frba.dds.queMePongo.exceptions.ElementoFaltanteException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUsuarios {
  private List<Usuario> repositorioDeUsuarios = new ArrayList<>();

  private static final RepositorioDeUsuarios INSTANCE = new RepositorioDeUsuarios();

  public static RepositorioDeUsuarios instance() {
    return INSTANCE;
  }

  private RepositorioDeUsuarios() {}

  public List<Usuario> obtenerUsuarios() {
    return repositorioDeUsuarios;
  }

  public void agregarUsuario(Usuario usuario) {
    repositorioDeUsuarios.add(usuario);
  }

  public void eliminarUsuario(Usuario usuario) {
    repositorioDeUsuarios.remove(usuario);
  }

  public Usuario encontrarUsuario(Usuario usuario) {
    if (!repositorioDeUsuarios.stream().anyMatch(usuario1 -> usuario1 == usuario)) {
      throw new ElementoFaltanteException("El usuario que se trata de encontrar no existe en el repositorio");
    }
    return repositorioDeUsuarios.stream().filter(u -> u == usuario).toList().get(0);
  }
}
