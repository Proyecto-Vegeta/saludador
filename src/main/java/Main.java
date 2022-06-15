import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ingrese numero:");
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.nextLine();
        int factor = Integer.parseInt(numero);
        int factorial = 1;
        for (int i=2; i<=factor; i++) {
            factorial = factorial*i;
        }
        System.out.println("El factorial de " + factor + " es " + factorial);
    }
}
