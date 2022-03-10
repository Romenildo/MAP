package LojaDeRoupas_6.Observer;

public interface Observer {

	public void notificacaoPedido(boolean status);
	public String notificacaoEditPedido(boolean status, String mensagem);

}
