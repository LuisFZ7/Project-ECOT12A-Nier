package br.edu.unifei.projetofinal;

public class TipoGunner extends Batalha {
	private String distanciaAtaque;
	public TipoGunner(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Foco em combate a distancia";
	}
	public String getDistanciaAtaque() {
		return distanciaAtaque;
	}
	public void setDistanciaAtaque(String distanciaAtaque) {
		this.distanciaAtaque = distanciaAtaque;
	}
}
