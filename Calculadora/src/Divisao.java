public class Divisao extends Calculadora {

    public Divisao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public double calcular() {
        if (valor2 == 0) {
            System.out.println("Erro: não é possível dividir por zero.");
            return 0;
        }
        return valor1 / valor2;
    }
}
