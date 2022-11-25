package atividade4.poo;

public class TesteComputador {
	public static void main(String[] args) {
		
		Mouse m = new Mouse("HGY6654", "Microsoft", "Preto");
		
		Teclado t = new Teclado("1232", "Logitech", "Preto");
		
		Monitor mon = new Monitor("AFB876", "Samsung","Preto");
		
		Gabinete g = new Gabinete("4587HHY", "Logitech", "Preto");
		
		
		
		Computador cp = new Computador("76TRDE35", m, t, mon, g);
		
		System.out.println("INFORMACOES DO COMPUTADOR");
		System.out.println("----------------------");
		cp.ImprimeComputador();
	}
}