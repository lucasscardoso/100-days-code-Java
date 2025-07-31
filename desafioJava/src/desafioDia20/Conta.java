package desafioDia20;

public class Conta {

	private int numConta;
	private String nome;
	private double saldo;
	private double deposito;
	private double saque;
	
	public Conta() {}
	
	public Conta(int numConta, String nome, double saldo, double deposito, double saque) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = 1000.0;
		this.deposito = deposito;
		this.saque = saque;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	public double sacar(double s) {
		double result = getSaldo() - s;
		setSaldo(result);
		return result;
	}
	
	public double depositar(double d) {
		double result = d + getSaldo();
		setSaldo(result);
		return result;
	}
	
	public void saldo() {
		System.out.println("Seu Saldo é $: " + getSaldo());
	}

	@Override
	public String toString() {
		return "Conta = " + numConta + ", Nome = " + nome + ", Saldo = $" + saldo;
	}
	
	
}
