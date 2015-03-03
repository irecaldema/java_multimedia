package com.zubiri.multiteca;

public class Artista {

	private String nombre;
	private int añoNacimiento;

	public Artista(String nombre, int añoNacimiento) {
	
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	}
	
	public Artista(String artista, String separador) {
		
		String[] separados = artista.split(separador);
		setNombre(separados[0]);
		setAñoNacimiento(separados[1]);
	}	
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAñoNacimiento() {
		
		return añoNacimiento;
	}

	public void setAñoNacimiento(int añoNacimiento) {
		
		this.añoNacimiento = añoNacimiento;
	}
	
}
