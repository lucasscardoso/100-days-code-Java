package desafioDia16;

import desafioDia16.Prioridades.Prioridade;

public class Tarefa {

	private String descricao;
	private Prioridade prioridade;
	
	public Tarefa() {}
	
	public Tarefa(String descricao, Prioridade prioridade) {
		this.descricao = descricao;
		this.prioridade = prioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return "Descrição = " + descricao + " , Prioridade = " + prioridade;
	}
	
	
	
}
