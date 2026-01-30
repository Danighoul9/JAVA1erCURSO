package Tema6.PolimorfismoInterfaces;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main(String[] args) {

        List<Renderizable> renderizables = new ArrayList<>();
        Casa3D casita = new Casa3D(200,150,100,150);
        Palmera palmeroncio = new Palmera(35,67,"Ibérica");

        renderizables.add(casita);
        renderizables.add(palmeroncio);


        for (Renderizable rs : renderizables){
            rs.init();
            rs.dispose();
            rs.render();
            rs.update();

            if (rs instanceof  Casa3D){
                Casa3D c = (Casa3D) rs;
                IO.println(c);
            }

            if (rs instanceof Palmera){
                Palmera p= (Palmera) rs;
                IO.println(p);
            }
        }
    }
}
