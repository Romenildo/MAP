package LojaDeRoupas_1.Modelo.Tenis;

public class Esportivo extends Tenis{
	private static final float preco = 95.0f;
    private static final String descricao = "Esportivo";
    
    public float getPreco(){
        return this.preco;
    }

    public String getDescricao(){
        return this.descricao;
    }
}