package br.edu.unifei.projetofinal;

public class TipoBattler extends Batalha {
	private String tipoAtaque;
	public TipoBattler(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Foco em ataques de frente";
	}
	public String getTipoAtaque() {
		return tipoAtaque;
	}
	public void setTipoAtaque(String tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}
}
