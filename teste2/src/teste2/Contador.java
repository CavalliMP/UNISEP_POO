package teste2;

public class Contador {
	double  valor=0;
	
	public Contador(double  valor) {
		this.valor = valor;
	}
	
	public double  zerar() {
		valor = 0;
		return valor;
	}
	public double  incrementar() {
		valor += 1;
		return valor;
	}
	public double  mostrarValor() {
	System.out.println(valor);
     return valor;
	}
}
