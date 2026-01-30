package Tema4.TareasTema4.EJ7Incidencia;

public class TestIncidencia {
    public static void main(String[] args) {

        Tecnico te1 = new Tecnico("Antonio García", "Tec. Informático",
                "antgar@gmail.com", "656565666");

        Incidencia inc1 = new Incidencia("Router no funciona");
        Incidencia inc2 = new Incidencia("No funciona el disco duro");
        Incidencia inc3 = new Incidencia("Pantallazo azul");
        Incidencia inc4 = new Incidencia("No acceso a carpeta compartida");

        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);

        System.out.println("Hay " + Incidencia.getPendientes()+ " incidencias pendientes");

        inc2.asignaTecnico(te1);
        inc4.asignaTecnico(te1);

        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);

        inc2.resuelve("Cambio de ssd");
        inc4.resuelve("Ajuste de permisos en carpetas compartidas");

        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);

        System.out.println("Hay " + Incidencia.getPendientes()+ " incidencias pendientes");


    }
}
