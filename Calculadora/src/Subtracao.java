public class Subtracao extends Calculadora {

    public Subtracao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public double calcular() {
        return valor1 - valor2;
    }
}
