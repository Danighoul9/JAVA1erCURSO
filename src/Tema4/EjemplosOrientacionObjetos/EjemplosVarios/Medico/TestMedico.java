package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Medico;

public class TestMedico {

    static void main(String[] args) {
        Medico medico1 = new Medico("Sandoval",Especialidad.Neurólogo,35,"SandovalMedicina@hospital.com",
                689129078);

        Medico medico2 = new Medico("Ramiro",Especialidad.Digestivo,56,"RamiroMedicina@hospital.com",
                614558892);

        //Mostramos los dos medicos tal cual
        System.out.println(medico1);
        System.out.println(medico2);

        //Damos de baja al medico 2
        medico2.baja();
        //Comprobamos la baja (estado inactivo)
        System.out.println(medico2);

    }


}
