package LojaDeRoupas_1.Modelo.Tenis;

public class Sapatenis extends Tenis{
	
	//Adicioanr os demais atributos
	private static final float preco = 90.0f;
    private static final String descricao = "Sapatenis";
    
    public float getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }
}