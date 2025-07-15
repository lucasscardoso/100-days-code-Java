package desafioDia5;

public class Funcionario {

	private String nome;
	private String departamento;
	private String dataEntrada;
	private String rg;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String departamento, String dataEntrada, String rg, double salario) {
		
		this.nome = nome;
		this.departamento = departamento;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void aumentoSalario (double porcentagem) {
		
		this.salario *= (porcentagem / 100 + 1);
		
	}
	
	public void calculaGanhoAnual() {
		System.out.println("Seu Salario em um ano é: " + salario * 12);
	}

	@Override
	public String toString() {
		return "Funcionario\n nome: " + nome + "\n departamento: " + departamento + "\n dataEntrada: " + dataEntrada + "\n rg: "
				+ rg + "\n salario: " + salario + "";
	}
	
	
	
	
}
