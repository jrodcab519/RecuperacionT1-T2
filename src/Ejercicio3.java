import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce primer parametro:");
        double x1 = s.nextDouble();

        System.out.println("Introduce segundo parametro:");
        double y1 = s.nextDouble();

        System.out.println("Introduce tercer parametro:");
        double x2 = s.nextDouble();

        System.out.println("Introduce cuarto parametro:");
        double y2 = s.nextDouble();

        System.out.println(distancia(x1, y1, x2, y2));
    }

    private static double distancia(double x1, double y1, double x2, double y2) {

        double distancia;

        distancia = Math.sqrt(Math.pow(x1 -  x2, 2) + Math.pow(y1 - y2, 2));

        return distancia;
    }
}
