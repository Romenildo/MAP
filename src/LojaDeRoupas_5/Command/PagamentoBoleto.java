package LojaDeRoupas_5.Command;


public class PagamentoBoleto implements PagamentoCommand {

    @Override
    public String processarCompra() {
        System.out.println("Pagamento realizado por Boleto!");
        return "Boleto";
    }
    
}
