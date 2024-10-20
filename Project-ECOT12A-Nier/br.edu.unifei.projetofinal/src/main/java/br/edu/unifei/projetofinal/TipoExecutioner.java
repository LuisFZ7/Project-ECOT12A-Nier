package br.edu.unifei.projetofinal;

public class TipoExecutioner extends Batalha {
	private boolean temDisfarce;
	public TipoExecutioner(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Executar androides renegados";
	}
	public boolean isTemDisfarce() {
		return temDisfarce;
	}
	public void setTemDisfarce(boolean temDisfarce) {
		this.temDisfarce = temDisfarce;
	}
}
