package br.edu.unifei.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class Agrupamento extends Androide {
	private List<Androide> elementos = new ArrayList<Androide>();
	public Agrupamento(Afiliacao afiliacao) {
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
	public String objetivo() {
		return objetivo();
	}
}
