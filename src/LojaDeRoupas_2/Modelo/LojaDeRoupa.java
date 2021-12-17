package LojaDeRoupas_2.Modelo;

public class LojaDeRoupa {
	
	private String calca;
	private String camisa;
	private String chapeu;
	private String shorts;
	private String vestido;
	
	public LojaDeRoupa(String calca, String camisa, String chapeu, String shorts, String vestido) {
		this.calca = calca;
		this.camisa = camisa;
		this.chapeu = chapeu;
		this.shorts = shorts;
		this.vestido = vestido;
	}
	
	public String getCalcas() {
		return calca;
	}
	public void setCalcas(String calca) {
		this.calca = calca;
	}
	public String getCamisas() {
		return camisa;
	}
	public void setCamisas(String camisa) {
		this.camisa = camisa;
	}
	public String getChapeus() {
		return chapeu;
	}
	public void setChapeus(String chapeu) {
		this.chapeu = chapeu;
	}
	public String getShorts() {
		return shorts;
	}
	public void setShorts(String shorts) {
		this.shorts = shorts;
	}
	public String getVestidos() {
		return vestido;
	}
	public void setVestidos(String vestido) {
		this.vestido = vestido;
	}
	
	@Override
	public String toString() {
		return "LojaDeRoupa [calcas=" + calca + ", camisas=" + camisa + ", chapeus=" + chapeu + ", shorts=" + shorts + ", vestidos=" + vestido + "]";
	}
	
	
}
