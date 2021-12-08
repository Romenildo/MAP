package LojaDeRoupas_1.Modelo.Vestidos;

public class Curto extends Vestido{
	
	//Adicionar os demais atributos
	private static final float preco = 45.0f;
    private static final String descricao = "Curto";
    
    public float getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }
}