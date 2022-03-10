package LojaDeRoupas_6.Observer;

import java.util.ArrayList;

public class Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void adicionarObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notificarObserver(boolean status) {
		for(Observer observer:observers) {
			observer.notificacaoPedido(status);
		}
	}
	
	public void enviarObserver(Object object) {
		System.out.println("\nNotificacao Enviada com sucesso");
	}

}
