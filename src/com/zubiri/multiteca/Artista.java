package com.zubiri.multiteca;

import java.util.Scanner;

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
		setAñoNacimiento(Integer.parseInt(separados[1]));
	}
	
	public Artista (Scanner sc){
		System.out.println("nombre: ");
		setNombre(sc.next());	
		System.out.println("Año de nacimiento: ");
		setAñoNacimiento(sc.nextInt());
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
	
	public String formattedArtista() {
		
		String formattedObra=
			"\nAutor: "+this.nombre+"| Año de nacimiento: "+this.añoNacimiento;
		return formattedObra;
	}
	
}
