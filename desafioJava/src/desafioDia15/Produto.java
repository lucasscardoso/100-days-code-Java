package desafioDia15;

public class Produto {

	//(nome, quantidade e preço unitário).
	
	private String nome;
	private int quantidade;
	private double precoUniotario;
	
	
	
	public Produto() {}
	
	public Produto(String nome, int quantidade, double precoUniotario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUniotario = precoUniotario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUniotario() {
		return precoUniotario;
	}

	public void setPrecoUniotario(double precoUniotario) {
		this.precoUniotario = precoUniotario;
	}
	

	
	public String listProd(Produto p) {
		return "Nome: " + p.getNome() + " , Quantidade: " + p.getQuantidade() +  " , Preço Unitario: " + p.getPrecoUniotario();
	}
	

	@Override
	public String toString() {
		return "Nome = " + nome + ", Quantidade = " + quantidade + ", Preço Uniotario = " + precoUniotario ;
	}
	
	
	
	
	
}
