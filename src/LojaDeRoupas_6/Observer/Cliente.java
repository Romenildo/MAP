package LojaDeRoupas_6.Observer;

public class Cliente implements Observer {
	
	@Override
	public void notificacaoPedido(boolean status) {
		if(status) {
			System.out.println("!!!Seu Produto ja foi notificado a Loja");
		}else {
			System.out.println("!!!Seu produto ainda nao está disponivel");
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
