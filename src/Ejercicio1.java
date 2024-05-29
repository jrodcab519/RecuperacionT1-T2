import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el precio:");

        int precio = s.nextInt();

        System.out.println("Precio del regalo: " + precio);

        System.out.println("Introduce el IVA:");

        int iva = s.nextInt();

        System.out.println("IVA aplicado: " + iva);

        double precioFinal = preciofinal(precio, iva);

        System.out.println("Una vez sumado el IVA el precio final es: " + precioFinal + " euros" );

        System.out.println("Introduce el número de amigos:");

        int amigos = s.nextInt();

        System.out.println("Número de amigos que van a participar en la compra del regalo: " + amigos);

        double cuantoAportar = cuantoAportar(precioFinal, amigos);

        System.out.println("Cada amigo tiene que aportar: " + cuantoAportar + " euros.");

    }

    private static double cuantoAportar(double precioFinal, int amigos) {


        return precioFinal / amigos;
    }

    private static double preciofinal(int precio, int iva) {


        return precio + ((double) (precio * iva) /100);
    }


}
