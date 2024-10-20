package br.edu.unifei.projetofinal;

public class TipoOperator extends Suporte {
	private String ordem;
	public TipoOperator(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Manda instrucoes da da missao da nave Yorha fora do planeta";
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
}
