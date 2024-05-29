import java.util.Scanner;

public class Ejecicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = s.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = s.nextInt();

        System.out.println("Introduce el tercer número:");
        int num3 = s.nextInt();

       int resultado =  maximo3(num1, num2, num3);

        System.out.println(resultado);
    }

    private static int maximo3(int num1, int num2, int num3){
        int resultado = 0;

        if(num1 > num2 && num1 > num3){
            resultado = num1;
        }
        if (num2 > num1 && num2 > num3){
            resultado = num2;
        }
        if (num3 > num1 && num3 > num2){
            resultado = num3;
        }
        return resultado;
    }
}
