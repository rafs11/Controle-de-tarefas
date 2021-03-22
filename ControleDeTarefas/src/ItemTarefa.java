
public class ItemTarefa {
	private double percentual;
	private String dataExecucao;
	private String descricao;
	private Tarefa tarefa;


	public ItemTarefa(double per, String des, Tarefa t) {
		this.percentual = per;
		this.descricao = des;
		this.tarefa = t;
	}
	
	public ItemTarefa(String string, double d) {
		
	}

	//conclui tarefa e atualiza status
	public void concluir(String data) {
		dataExecucao = data;
		
		if(this.tarefa != null) {
			this.tarefa.atualizaStatus();
		}
	}

	@Override
	public String toString() {
		super.toString();
		return "[percentual:" + percentual + "]" + " " + descricao;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public String getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(String dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
}
