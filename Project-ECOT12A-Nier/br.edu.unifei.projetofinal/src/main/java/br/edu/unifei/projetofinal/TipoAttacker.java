package br.edu.unifei.projetofinal;

public class TipoAttacker extends Batalha {
	private boolean temBerserker;
	public TipoAttacker(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Foco em ataques de frente, podem ativar modo berserker";
	}
	public boolean isTemBerserker() {
		return temBerserker;
	}
	public void setTemBerserker(boolean temBerserker) {
		this.temBerserker = temBerserker;
	}
}
