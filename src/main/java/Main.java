import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean error = false;
        do {
            System.out.println("Ingrese numero:");
            Scanner scanner = new Scanner(System.in);
            String numero = scanner.nextLine();
            try {
                int factor = Integer.parseInt(numero);
                if (factor > 0) {
                    int factorial = 1;
                    for (int i=2; i<=factor; i++) {
                        factorial = factorial*i;
                    }
                    System.out.println("El factorial de " + factor + " es " + factorial);
                    error = false;
                } else {
                    System.out.println("ERROR: Debe ingresar un numero mayor a 0.");
                    error = true;
                }
            } catch (NumberFormatException exception) {
                System.out.println("ERROR: Debe ingresar un numero entero.");
                error=true;
            }
        } while(error);
    }
}
