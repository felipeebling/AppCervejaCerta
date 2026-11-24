
public class Cerveja {
	private int id;
	private String nome;
	private String tipo;
	private double teorAlcolico;
	private int ibu;
	private String paisOrigem;
	private String dataDesgustacao;
	private String localDesgustacao;
	private double avaliacao;
	private String comentarios;
	
	public Cerveja() {}
	
	public Cerveja(String nome, String tipo, double teorAlcolico, int ibu, String paisOrigem, String dataDesgustacao,
			String localDesgustacao, double avaliacao, String comentarios) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.teorAlcolico = teorAlcolico;
		this.ibu = ibu;
		this.paisOrigem = paisOrigem;
		this.dataDesgustacao = dataDesgustacao;
		this.localDesgustacao = localDesgustacao;
		this.avaliacao = avaliacao;
		this.comentarios = comentarios;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getTeorAlcolico() {
		return teorAlcolico;
	}
	public void setTeorAlcolico(double teorAlcolico) {
		this.teorAlcolico = teorAlcolico;
	}
	public int getIbu() {
		return ibu;
	}
	public void setIbu(int ibu) {
		this.ibu = ibu;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getDataDesgustacao() {
		return dataDesgustacao;
	}
	public void setDataDesgustacao(String dataDesgustacao) {
		this.dataDesgustacao = dataDesgustacao;
	}
	public String getLocalDesgustacao() {
		return localDesgustacao;
	}
	public void setLocalDesgustacao(String localDesgustacao) {
		this.localDesgustacao = localDesgustacao;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	@Override
	public String toString() {
		return "Cerveja [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", teorAlcolico=" + teorAlcolico + ", ibu="
				+ ibu + ", paisOrigem=" + paisOrigem + ", dataDesgustacao=" + dataDesgustacao + ", localDesgustacao="
				+ localDesgustacao + ", avaliacao=" + avaliacao + ", comentarios=" + comentarios + "]";
	}
	
	
	

}
