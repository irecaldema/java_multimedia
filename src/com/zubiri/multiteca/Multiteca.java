package com.zubiri.multiteca;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca() {
		
	}

	public Multiteca(ArrayList<Obra> obras) {
		
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		
		multiteca=obras;
	}
	
	public ArrayList<Obra> getMultiteca() {
		
		return multiteca;
	}
	
	public void addObra(Obra obra) {
		
		multiteca.add(obra);	
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
	
	public static void leerDistribuidores(String fichero) throws IOException {
			String linea;
			FileInputStream f;
		    InputStreamReader fr;
		    BufferedReader br;
		    
		    f = new FileInputStream(fichero);
	    	fr = new InputStreamReader(f, "UTF8");
	    	br = new BufferedReader(fr);
	    	linea = br.readLine();
			
			if (linea == null) {
				System.out.println("No existen obras en el fichero");
			}
			
			while ((linea != null) && (linea.compareTo("") != 0)) {
				Obra obra = new Obra(linea,",");
				multiteca.add(obra);
				linea = br.readLine();
			}
			br.close();
	 }
	
}
