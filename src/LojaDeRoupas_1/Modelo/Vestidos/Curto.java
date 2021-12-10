package LojaDeRoupas_1.Modelo.Vestidos;

public class Curto extends Vestido{
	
	
	private static final float preco = 45.0f;
    private static final String descricao = "Curto";
    private static String cor;
    private static String tamanho;//P M G GG EGG
	private static String genero;//feminino
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