package LojaDeRoupas_6.Observer;

public class Gerente extends Subject{

	private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		notificarObserver(status);
		
	}

}
