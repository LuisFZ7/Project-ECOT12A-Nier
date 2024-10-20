package br.edu.unifei.projetofinal;

public class TipoDefender extends Suporte {
	private float vidaBarreira;
	public TipoDefender(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Cria escudos para servir de barreira para os outros androides";
	}
	public float getVidaBarreira() {
		return vidaBarreira;
	}
	public void setVidaBarreira(float vidaBarreira) {
		this.vidaBarreira = vidaBarreira;
	}
}
