package br.edu.unifei.projetofinal;

public class TipoHealer extends Suporte {
	private String quantidadeCura;
	public TipoHealer(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Foco em reparar androides danificados";
	}
	public String getQuantidadeCura() {
		return quantidadeCura;
	}
	public void setQuantidadeCura(String quantidadeCura) {
		this.quantidadeCura = quantidadeCura;
	}	
}
