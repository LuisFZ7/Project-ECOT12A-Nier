package br.edu.unifei.projetofinal;

import java.util.Calendar;

public class ProjectGestalt {
	private Calendar data;
	private String descricao;
	private TipoMaso tipomaso;
	private Humanos humano;
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoMaso getTipomaso() {
		return tipomaso;
	}
	public void setTipomaso(TipoMaso tipomaso) {
		this.tipomaso = tipomaso;
	}
	public Humanos getHumano() {
		return humano;
	}
	public void setHumano(Humanos humano) {
		this.humano = humano;
	}
	
}
