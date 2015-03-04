package com.zubiri.multiteca;

import java.util.Scanner;
import java.util.ArrayList;

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
		
		String formattedArtista=
			"\nAutor: "+this.nombre+"| Año de nacimiento: "+this.añoNacimiento;
		return formattedArtista;
	}
	
	public String formattedInterpretes(ArrayList al_interpretes){
		String s_interpretes="\ninterpretes: "+ al_interpretes.size();
		for (int i=0; i<al_interpretes.size(); i++) {
			s_interpretes+="\n\tInterprete: "+al_interpretes.get(i).getNombre()+" | Año de nacimiento: "+al_interpretes.get(i).getAñoNacimiento();
		}
			return s_interpretes;	
	}
	
}
