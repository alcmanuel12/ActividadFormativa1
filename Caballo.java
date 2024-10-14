package actividadFormativa1;

public class Caballo {
	
	private String Nombre;
	private String Color;
	private int Edad;
	private int Carreras_Ganadas;
	private int Carreras_Perdidas;
	private int Trofeos_ganados;
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getCarreras_Ganadas() {
		return Carreras_Ganadas;
	}
	public void setCarreras_Ganadas() {
		Carreras_Ganadas++;
	}
	public int getCarreras_Perdidas() {
		return Carreras_Perdidas;
	}
	public void setCarreras_Perdidas() {
		Carreras_Perdidas++;
	}
	public int getTrofeos_ganados() {
		return Trofeos_ganados;
	}
	public void setTrofeos_ganados() {
		Trofeos_ganados++;
	}
	
	
	

}
