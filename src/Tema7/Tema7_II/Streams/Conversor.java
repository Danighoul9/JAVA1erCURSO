package Tema7.Tema7_II.Streams;


public interface Conversor {

    void toPDF();

    default void toText(Object o) {
        System.out.println(o.toString());
    }

}
