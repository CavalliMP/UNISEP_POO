public class Main {

    public static void main(String[] args) {

        double valor1 = 10;
        double valor2 = 5;

        Soma soma = new Soma(valor1, valor2);
        Subtracao subtracao = new Subtracao(valor1, valor2);
        Multiplicacao multiplicacao = new Multiplicacao(valor1, valor2);
        Divisao divisao = new Divisao(valor1, valor2);

        System.out.println("Soma: " + soma.calcular());
        System.out.println("Subtração: " + subtracao.calcular());
        System.out.println("Multiplicação: " + multiplicacao.calcular());
        System.out.println("Divisão: " + divisao.calcular());
    }
}
