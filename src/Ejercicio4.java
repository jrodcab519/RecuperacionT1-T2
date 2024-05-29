public class Ejercicio4 {
    public static void main(String[] args) {

        double random;

        for (int i = 0; i < 100; i++) {

            random = Math.random() * 20;

            if (random / 3 == 0) {
                System.out.println(random);
            }
        }
    }
}
