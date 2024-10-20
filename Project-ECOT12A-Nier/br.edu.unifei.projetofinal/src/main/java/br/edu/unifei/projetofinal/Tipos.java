package br.edu.unifei.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Tipos extends Androide {
	private List<Androide> elementos = new ArrayList<Androide>();
	public Tipos(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String objetivo(String objetivo) {
		return "Recebido por Yorha";
	}
	public String missao() {
		return "Variado";
	}
	public String acao() {
		return "Realizar acao";
	}
	public List<Androide> getElementos() {
		return elementos;
	}
	public void setElementos(List<Androide> elementos) {
		this.elementos = elementos;
	}
	@Override
	public String objetivo() {
		return null;
	}
}
