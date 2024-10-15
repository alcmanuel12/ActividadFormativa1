package actividadFormativa1;

public class Movil {
	
	private String marca;
	private String modelo;
	private static int numero = (int) (Math.random() * 999999999) + 111111111; ;
	private String memoria;
	private String creado;
	
	public Movil (String marca, String modelo, String memoria) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
		
	}

	public void creado() {
		creado = "creado" ;
	}
	public String getmarca() {
		return marca;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public String getmemoria() {
		return memoria;
	}
	
	public static void main(String[] args) {
		
		Movil movil1 = new Movil ("Iphone", "x", "10Gb");
		movil1.creado();
		
		System.out.println("La marca del movil es: " + movil1.getmarca());
		System.out.println("El modelo del movil es: " + movil1.getmodelo());
		System.out.println("El numero del movil es: +34 " + numero);
		System.out.println("La memoria del movil es: " + movil1.getmemoria());
		
	}

}
