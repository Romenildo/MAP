package LojaDeRoupas_5.Command;


public class PagamentoCartao implements PagamentoCommand {

    @Override
    public String processarCompra() {
        System.out.println("Pagamento realizado no cartao!");
        return "Cartao";
    }
}
