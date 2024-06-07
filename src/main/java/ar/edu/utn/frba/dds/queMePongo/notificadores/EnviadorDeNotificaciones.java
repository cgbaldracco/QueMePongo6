package ar.edu.utn.frba.dds.queMePongo.notificadores;

public class EnviadorDeNotificaciones {
  private static NotificationService notificationService;

  public static NotificationService obtenerEnviadorDeNotificaciones() {
    return notificationService;
  }

  public void setNotificador(NotificationService notificationService) {
    EnviadorDeNotificaciones.notificationService = notificationService;
  }

  public static void enviarNotificacion(String mensaje) {
    notificationService.notify(mensaje);
  }
}
