package com.zubiri.multiteca;

import java.util.ArrayList;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca() {
		
	}

	public Multiteca(ArrayList<Obra> obras) {
		
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		
	}
	
	public ArrayList<Obra> getMultiteca() {
		
		return multiteca;
	}
	
	public void addObra(Obra obra) {
		
	}
	
	public Obra obtainObra(int index) {
		
		return multiteca.get(index);
	}
	
	public static int counter() {
		return numObras;
	}
	
	public String formattedMultiteca() {
		
		String formattedMultiteca="";
		return formattedMultiteca;
	}
	
}
