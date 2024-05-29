import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el número de casos de prueba:");
        int entradas = s.nextInt();

        for (int i = 0; i < entradas; i++) {

            System.out.println("Introduce un dia:");
            int dia = s.nextInt();
            if (dia < 1 || dia > 31){
                System.out.println("El día tiene que estar entre 1 y 31");
            }
            System.out.println("Introduce un mes:");

            int mes = s.nextInt();
            if (mes <1 || mes >12) {
                System.out.println("El mes tiene que estar entre 1 y 12");
            }
            diasRestantes(dia,mes);
        }

    }
    private static void diasRestantes(int dia, int mes){

        int restantes = 0;

        switch (mes){
            case 1:
                if(mes == 2){
                    restantes = (28 - dia);
                    System.out.println(restantes);
                }
                break;
            case 2:
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
                    restantes = (31 - dia);
                    System.out.println(restantes);
                }

                break;
            case 3:
                if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    restantes = (30- dia);
                    System.out.println(restantes);
                }
                break;

        }

    }
}
