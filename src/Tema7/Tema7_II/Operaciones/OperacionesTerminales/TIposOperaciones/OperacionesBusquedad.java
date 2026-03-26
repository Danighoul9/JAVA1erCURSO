package Tema7.Tema7_II.Operaciones.OperacionesTerminales.TIposOperaciones;

import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.CategoriaProducto;
import Tema7.Tema7_II.Operaciones.OperacionesTerminales.Entidades.Producto;

import java.util.List;
import java.util.Optional;

public class OperacionesBusquedad {
    static void main() {

        List<Producto> tienda = List.of(
                new Producto("iPhone17","",1000.0, CategoriaProducto.MOVILES),
                new Producto("Xiaomi 17","", 999.0, CategoriaProducto.MOVILES),
                new Producto("Mac Neo","Vaya castaña", 800.0, CategoriaProducto.PORTATILES),
                new Producto("Lenovo X Ultra","", 900.0, CategoriaProducto.PORTATILES),
                new Producto("Samsung Galaxy S26 Ultra","", 1400.0, CategoriaProducto.PORTATILES),
                new Producto("Asus 5080", "Imposible", 1200.0, CategoriaProducto.COMPONENTES)
        );

        //allMatch
        boolean todosMenosDe1000 = tienda.stream().allMatch(p -> p.getPrecio() < 1200);
        IO.println("Todos menos de 1000€? " + todosMenosDe1000);

        //anyMatch
        boolean algunComponente = tienda.stream()
                .anyMatch(p -> p.getCategoria().equals(CategoriaProducto.COMPONENTES));
        IO.println("Algún componente? " + algunComponente);

        //noneMatch
        boolean noSonTablets = tienda.stream()
                .noneMatch(p -> p.getCategoria().equals(CategoriaProducto.TABLETS));
        IO.println("No son tablets? " + noSonTablets);

        //findAny -> productos por encima de 1200
        Optional<Producto> productoCaro = tienda.stream()
                .filter(p -> p.getPrecio() >= 1200.0)
                .findAny();
        productoCaro.ifPresent(producto -> IO.println(producto.getNombre()));

        //findFirst -> Primer portátil que encuentres
        Optional<Producto> primerPortatil = tienda.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.PORTATILES))
                .findFirst();
        if (primerPortatil.isPresent()) {
            Producto portatil = primerPortatil.get(); //Con get extraemos el objeto del Optional
            IO.println(portatil.getNombre());
        }

        //Optional con orElse
        Producto primerPeriferico = tienda.stream()
                .filter(p -> p.getCategoria().equals(CategoriaProducto.PERIFERICOS))
                .findFirst()
                .orElse(new Producto("Producto No encontrado","",0.0,CategoriaProducto.PERIFERICOS));








    }
}