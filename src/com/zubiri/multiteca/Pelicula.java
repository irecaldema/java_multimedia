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
		Multiteca.addObra(this);
	}
	
	public Pelicula (Scanner sc){
		super(sc);
		System.out.println("Productora: ");
		setProductora(sc.next());
		System.out.println("¿Cuantos interpretes tiene?");
		for (int i=0; sc.nextInt()<i; i++){
		System.out.println(i+"º interprete: ");			
			Artista interprete = new Artista(sc);
			addInterprete(interprete);
		}
		Multiteca.addObra(this);
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
	
	public void addInterprete(Artista interprete) {
		
		interpretes.add(interprete);
	}
	
	@Override public String formattedObra() {
		
		String formattedObra=
			super.formattedObra()+
			"\nProductora: "+this.productora+
			this.formattedInterprete();
		return formattedObra;	
	}
	
	public String formattedInterprete(){
		String interprete="\ninterpretes: "+ interpretes.size();
		for (int i=0; i<interpretes.size(); i++) {
			interprete+="\n\tInterprete: "+this.interpretes.get(i).getNombre()+"| Año de nacimiento: "+this.interpretes.get(i).getAñoNacimiento();
		}
			return interprete;	
	}

}
