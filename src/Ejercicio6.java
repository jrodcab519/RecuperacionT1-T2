import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número par mayor o igual o 2:");
        int num = s.nextInt();

        char asterisco = '*';
        char punto = '.';

        if (num < 2 || num % 2 != 0) {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(asterisco);
                for (int j = 0; j < num - i; j++) {
                    System.out.println(punto);
                }
            }
        }
    }
}
