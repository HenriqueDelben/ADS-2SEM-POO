package atividade4.poo;

public class Computador {
	private String numSerie;
	private Mouse mouse;
	private Teclado teclado;
	private Monitor monitor;
	private Gabinete gabinete;
	
	public Computador(String numSerie, Mouse mouse, Teclado teclado, Monitor monitor, Gabinete gabinete) {
		super();
		this.numSerie = numSerie;
		this.mouse = mouse;
		this.teclado = teclado;
		this.monitor = monitor;
		this.gabinete = gabinete;
	}

	public Computador() {
		
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}
	
	public void ImprimeComputador() {
		System.out.println("Numero de serie: " + this.numSerie);
		mouse.ImprimeMouse();
		teclado.ImprimeTeclado();
		monitor.ImprimeMonitor();
		gabinete.ImprimeGabinete();
    }
}


