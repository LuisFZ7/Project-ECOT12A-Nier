package br.edu.unifei.projetofinal;

public class ArmasBiologicas {
	private int numero;
	private TipoMaso tipomaso;
	public ArmasBiologicas(TipoMaso tipomaso) {
		this.tipomaso = tipomaso;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TipoMaso getTipomaso() {
		return tipomaso;
	}
	public void setTipomaso(TipoMaso tipomaso) {
		this.tipomaso = tipomaso;
	}
}
