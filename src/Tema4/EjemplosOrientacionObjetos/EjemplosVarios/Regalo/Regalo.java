package Tema4.EjemplosOrientacionObjetos.EjemplosVarios.Regalo;

public class Regalo {

    //Atributos del regalo
        private String nombre;
        private CategoriaRegalo categoriaRegalo;
        private Double precio;

    //Constructor
        public Regalo(String nombre, CategoriaRegalo categoriaRegalo, Double precio) {
            this.nombre = nombre;
            this.categoriaRegalo = categoriaRegalo;
            this.precio = precio;
        }

    //Getter
        public String getNombre() {
            return nombre;
        }

        public CategoriaRegalo getCategoriaRegalo() {
            return categoriaRegalo;
        }

        public Double getPrecio() {
            return precio;
        }

    //Setter
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCategoriaRegalo(CategoriaRegalo categoriaRegalo) {
            this.categoriaRegalo = categoriaRegalo;
        }

        public void setPrecio(Double precio) {
            this.precio = precio;
        }


    @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Regalo{");
            sb.append("nombre='").append(nombre).append('\'');
            sb.append(", categoriaRegalo=").append(categoriaRegalo);
            sb.append(", precio=").append(precio).append("€");
            sb.append('}');
            return sb.toString();
        }

    //Metodos propios

    //Incrementa el precio en un porcentaje
        public void subirPrecio(double porcentaje){
                this.precio = this.precio * (1 + porcentaje/100);
        }
    //Incrementa el precio aplicandole el IVA correspondiente
        public void aplicarIva(double iva){
            this.precio = this.precio * (1 + iva/100);
        }
}
