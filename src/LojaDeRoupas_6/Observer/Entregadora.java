package LojaDeRoupas_6.Observer;

public class Entregadora implements Observer{

	@Override
	public void notificacaoPedido(boolean status) {
		if(status) {
			System.out.println("!!!Requerimento de entrega de pedido");
		}else {
			System.out.println("!!!Pedido em espera da entregadora");
		}
		
	}

	@Override
	public String notificacaoEditPedido(boolean status, String mensagem) {
		if(status) {
			System.out.println("!!!"+mensagem);
		}else {
			System.out.println("!!!Erro ao enviar a notificacao");
		}
		return mensagem;

	}
}
