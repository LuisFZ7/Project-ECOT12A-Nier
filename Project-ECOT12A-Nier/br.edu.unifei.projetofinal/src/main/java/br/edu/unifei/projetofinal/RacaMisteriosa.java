package br.edu.unifei.projetofinal;

public class RacaMisteriosa extends Ser{
	private String raca;
	private String nome;
	private TipoMaso causou;
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public TipoMaso getCausou() {
		return causou;
	}
	public void setCausou(TipoMaso causou) {
		this.causou = causou;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
