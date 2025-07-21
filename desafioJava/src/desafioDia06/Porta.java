package desafioDia06;

public class Porta {

	private boolean aberta;
	private String cor;
	private double altura;
	private double largura;
	
	public Porta() {
		
	}
	
	public Porta(boolean aberta, String cor, double altura, double largura) {
			
			this.aberta = aberta;
			this.cor = cor;
			this.altura = altura;
			this.largura = largura;
		}
	
	
public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	//Metodos
	
	public void abre(boolean aberta) {
		setAberta(true);
	}
	
	public void fecha() {
		setAberta(false); 
	}
	
	public void pinta(String corNova) {
		setCor(corNova); 
	}
	
	public void estaAberta() {
		System.out.println("A porta esta aberta? " + isAberta());
	}

	@Override
	public String toString() {
		return "Porta\n aberta = " + aberta + ", cor = " + cor + ", altura = " + altura + ", largura  =" + largura + "";
	}
	
	

}


