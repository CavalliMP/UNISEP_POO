package exe2;

public class pais {
	String iso;
	String nome;
	double populacao;
	double km;
	
	public pais(String iso, String nome, double populacao, double km) {
		this.iso = iso;
		this.nome = nome;
		this.populacao = populacao;
		this.km = km;
	}
	public void getIso() {
		System.out.println(iso);
	}
}
