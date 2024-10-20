package br.edu.unifei.projetofinal;

import java.util.ArrayList;
import java.util.List;

public class PrimeiraGuerradasMaquinas {
	private int duracao;
	private List<Androide> androides = new ArrayList<Androide>();
	private List<Maquinas> maquinas = new ArrayList<Maquinas>();
	private List<Alienigenas> aliens = new ArrayList<Alienigenas>();
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public List<Androide> getAndroides() {
		return androides;
	}
	public void setAndroides(List<Androide> androides) {
		this.androides = androides;
	}
	public List<Maquinas> getMaquinas() {
		return maquinas;
	}
	public void setMaquinas(List<Maquinas> maquinas) {
		this.maquinas = maquinas;
	}
	public List<Alienigenas> getAliens() {
		return aliens;
	}
	public void setAliens(List<Alienigenas> aliens) {
		this.aliens = aliens;
	}
}
