package br.edu.unifei.projetofinal;

public class Shades{
	private String tamanho;
	private boolean temArmadura;
	private boolean agressivos;
	private SeparacaoAlmaECorpo separacaoalmaecorpo;
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isTemArmadura() {
		return temArmadura;
	}
	public void setTemArmadura(boolean temArmadura) {
		this.temArmadura = temArmadura;
	}
	public boolean isAgressivos() {
		return agressivos;
	}
	public void setAgressivos(boolean agressivos) {
		this.agressivos = agressivos;
	}
	public SeparacaoAlmaECorpo getSeparacaoalmaecorpo() {
		return separacaoalmaecorpo;
	}
	public void setSeparacaoalmaecorpo(SeparacaoAlmaECorpo separacaoalmaecorpo) {
		this.separacaoalmaecorpo = separacaoalmaecorpo;
	}
}
