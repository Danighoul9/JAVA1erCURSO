package Tema6.TareasTema6.EjPropuesto;

public class App {
    static void main() {

        SistemaNotificaciones sn = new SistemaNotificaciones();

        NotificacionEmail ne1 = new NotificacionEmail("Mandar a RRHH info",
                "Mándale a Sonia de RRHH los CVs de los de prácticas",
                "sonia_rrhh@empresa.com",
                "yo@empresa.com",
                false);
        NotificacionEmail ne2 = new NotificacionEmail("Mandar carta dimisión al jefe",
                "Ya no aguanto más, me voy",
                "cabronazo@empresa.com",
                "yo@empresa.com",
                true);

        NotificacionRedSocial nrs1 = new NotificacionRedSocial("Viaje a Roma",
                "Mira las fotos del viaje",
                "@antonio",
                TipoInteraccionRS.SHARE,
                "@yomismo",
                "fasebook://fotosviaje.com");
        NotificacionRedSocial nrs2 = new NotificacionRedSocial("Fiesta esta noche",
                "Vamooooooos",
                "@migrupo",
                TipoInteraccionRS.LIKE,
                "@yomismo",
                "fasebook://fiestuki.com");

        sn.addNotificacion(nrs1);
        sn.addNotificacion(nrs2);
        sn.addNotificacion(ne1);
        sn.addNotificacion(ne2);

        sn.enviarTodas();
        sn.getNotificaciones().get(1).marcarComoLeida();
        sn.getNotificaciones().get(3).marcarComoLeida();

        IO.println("-----------------");
        sn.pintarLeidas();
        IO.println("-----------------");
        sn.pintarResumen();
        IO.println("-----------------");
        sn.pintarPorPrioridad();


    }
}