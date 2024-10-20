package br.edu.unifei.projetofinal;

public class Suporte extends Androide{
	public String objetivo() {
		return "Salvar Humanidade";
	}
	public String missao() {
		return "Ajudar no campo de batalha";
	}
	public String acao() {
		return "Ajudar";
	}
	public Suporte(Afiliacao afiliacao) {
		super(afiliacao);
	}
	
}
