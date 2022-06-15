import java.util.Scanner;

public class Main {

    private static Calculador calc = new Factorizador();

    public static void main(String[] args) {
        boolean error = false;
        do {
            System.out.println("Ingrese numero:");
            Scanner scanner = new Scanner(System.in);
            String numero = scanner.nextLine();
            try {
                int factor = Integer.parseInt(numero);
                if (factor > 0) {
                    int factorial = calc.calcular(factor);
                    System.out.println("El " + calc.describir() + " de " + factor + " es " + factorial);
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
