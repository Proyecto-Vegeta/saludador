public class Factorizador implements Calculador{


    public int calcular(int valor) {
        int factorial = 1;
        for (int i = 2; i<= valor; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }

    public String describir() {
        return "factorial";
    }
}
