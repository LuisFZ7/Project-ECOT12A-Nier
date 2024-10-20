package br.edu.unifei.projetofinal;

import java.util.Calendar;

public class ExtincaoRacaHumana {
	private Calendar data;
	private String relato;
	private Humanos humanos;
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getRelato() {
		return relato;
	}
	public void setRelato(String relato) {
		this.relato = relato;
	}
	public Humanos getHumanos() {
		return humanos;
	}
	public void setHumanos(Humanos humanos) {
		this.humanos = humanos;
	}
}
