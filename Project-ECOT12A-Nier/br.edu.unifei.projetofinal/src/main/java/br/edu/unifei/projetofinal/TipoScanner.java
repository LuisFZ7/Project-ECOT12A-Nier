package br.edu.unifei.projetofinal;

public class TipoScanner extends Suporte {
	private String sexo;
	private String velocidadeScan;
	public TipoScanner(Afiliacao afiliacao) {
		super(afiliacao);
	}
	public String acao() {
		return "Foco scannear areas e hackear para conseguir data, tambem transfere personalidades da nave para o corpo dos androides";
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getVelocidadeScan() {
		return velocidadeScan;
	}
	public void setVelocidadeScan(String velocidadeScan) {
		this.velocidadeScan = velocidadeScan;
	}
}
