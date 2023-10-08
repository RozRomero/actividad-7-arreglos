import java.util.Scanner;

public class numerosact7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Número\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            int numero = numeros[i];
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }

        teclado.close();
    }
}
