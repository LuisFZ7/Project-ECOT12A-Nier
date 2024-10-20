package br.edu.unifei.projetofinal;

public class Batalha extends Androide {
	public Batalha(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String missao() {
		return "Atacar na linha de frente ou missoes de exterminio";
	}
	public String acao() {
		return "Atacar";
	}
	public String objetivo() {
		return null;
	}
}
