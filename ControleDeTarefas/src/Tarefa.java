import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Tarefa {
	
	private String nome;
	private double prioridade;
	private Date dataLimite;
	private String descricao;
	private double percentual = 0.0;
	private StatusTarefa status;
	
	private List<ItemTarefa> itens = new ArrayList<ItemTarefa>(); //lista de itens de tarefa

	
	public Tarefa(String nome, double prioridade) {
		this.nome = nome;
		this.prioridade = prioridade;
		this.status = StatusTarefa.PENDENTE;
	}
	
	public void adicionaItem(ItemTarefa item) {
		this.itens.add(item);
		item.setTarefa(this);
		
		if(item.getDataExecucao() != null) {
			atualizaStatus();
		}
	}
	
	public void atualizaStatus() {
		percentual = 0.0;
		for(ItemTarefa it : itens) {
			if(it.getDataExecucao() != null) {
				percentual += it.getPercentual();
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public Date getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(Date dataLimite) {
		this.dataLimite = dataLimite;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public StatusTarefa getStatus() {
		return status;
	}

	public void setStatus(StatusTarefa status) {
		this.status = status;
	}


}
