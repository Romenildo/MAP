package LojaDeRoupas_1.Modelo.Tenis;

public class CanoAlto extends Tenis{
	
	
	private static final float preco = 110.0f;
    private static final String descricao = "CanoAlto";
    private static String cor;
	private static String tamanho;// (32,33,34,35,36,37,38,40,41,42)
	private static String genero;//unisex/masculino/feminino
	private static String info; //juncao de todas as informacoes
    
    public float getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }
    
    public String getCor() {
		 return this.cor;
	 }
	 
	 public String getTamanho() {
		 return this.tamanho;
	 }
	 public String getGenero() {
		 return this.genero;
	 }
	 
	 public String getInfo() {
		 return this.info;
	 }
}


