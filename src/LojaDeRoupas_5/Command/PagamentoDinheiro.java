package LojaDeRoupas_5.Command;


public class PagamentoDinheiro implements PagamentoCommand {

    @Override
    public String processarCompra() {
        System.out.println("Pagamento realizado no Dinheiro!");   
        return "Dinheiro";
    }
}
