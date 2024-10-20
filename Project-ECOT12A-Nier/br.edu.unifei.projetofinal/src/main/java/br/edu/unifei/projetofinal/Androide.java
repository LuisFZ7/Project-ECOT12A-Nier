package br.edu.unifei.projetofinal;

public abstract class Androide extends Ser implements Afiliacao{
	private boolean temCaixaPreta;
	private int personalidade;
	private String corCabelo;
	private String corOlho;
	private PrimeiraGuerradasMaquinas participaram;
	private Afiliacao afiliacao;
	private boolean temEmocao;
	public abstract String missao();
	public abstract String objetivo();
	public boolean isTemEmocao() {
		return temEmocao;
	}
	public void setTemEmocao(boolean temEmocao) {
		this.temEmocao = temEmocao;
	}
	public Androide(Afiliacao afiliacao) {
		this.setAfiliacao(afiliacao);
	}
	public boolean isTemCaixaPreta() {
		return temCaixaPreta;
	}
	public void setTemCaixaPreta(boolean temCaixaPreta) {
		this.temCaixaPreta = temCaixaPreta;
	}
	public int getPersonalidade() {
		return personalidade;
	}
	public void setPersonalidade(int personalidade) {
		this.personalidade = personalidade;
	}
	public String getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(String corCabelo) {
		this.corCabelo = corCabelo;
	}
	public String getCorOlho() {
		return corOlho;
	}
	public void setCorOlho(String corOlho) {
		this.corOlho = corOlho;
	}
	public PrimeiraGuerradasMaquinas getParticiparam() {
		return participaram;
	}
	public void setParticiparam(PrimeiraGuerradasMaquinas participaram) {
		this.participaram = participaram;
	}
	public Afiliacao getAfiliacao() {
		return afiliacao;
	}
	public void setAfiliacao(Afiliacao afiliacao) {
		this.afiliacao = afiliacao;
	}
}
