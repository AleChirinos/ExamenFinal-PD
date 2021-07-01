package ExamenFinal.Ejercicio5Decorator.Decorator;

public class Client {

    public static void main(String[] args) {
        enumMarcas enumMarcas = null;

        ICelular celular = new Celular(enumMarcas.Apple, 1200, 6, 16,"Intel 750");
        celular = new Carcasa(celular, 100);
        celular = new VidrioTemplado(celular, 50);
        celular = new MemoriaExterna(celular, 50, 16);

        celular.operation();

        System.out.println("Precio: " + celular.getPrecioTotal() + " Almacenamiento: " + celular.getAlmacenamientoTotal());

    }

}
