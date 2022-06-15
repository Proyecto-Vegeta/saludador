public class Potenciador implements Calculador {
    @Override
    public int calcular(int valor) {
        return valor*valor;
    }

    @Override
    public String describir() {
        return "cuadrado";
    }
}
