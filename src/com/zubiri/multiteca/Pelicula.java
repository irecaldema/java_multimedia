package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int añoEdicion, String productora, ArrayList<Artista> interpretes) {
		super(titulo,autor,añoEdicion);
		setProductora(productora);
		setInterpretes(interpretes);
	}
	
	public Pelicula (Scanner sc){
		
	}
		
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) {
		
		this.productora = productora;
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
	@Override public String formattedObra() {
		
		String formattedObra=
			super.formattedObra()+
			"\nProductora: "+this.productora+
			"\ninterpretes: "+
			this.formattedInterprete();
		return formattedObra;	
	}
	
	public String formattedInterprete(){
		String interprete="";
		for (int i=0; interpretes.size()<i; i++) {
			interprete+="\n\tActor: "+this.interpretes.get(i).getNombre()+" Nacimiento: "+this.interpretes.get(i).getAñoNacimiento();
		}
			return interprete;	
	}

}
