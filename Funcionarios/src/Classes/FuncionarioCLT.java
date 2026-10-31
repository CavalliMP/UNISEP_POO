package Classes;

public class FuncionarioCLT extends Funcionario {

	public FuncionarioCLT(String nome, double salarioBase) {
		super(nome, salarioBase);
	}


	public double calcularSalario() {
		return salarioBase - (salarioBase * 0.08);
	}
}
