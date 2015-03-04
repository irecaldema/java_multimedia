package com.zubiri.multiteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Artistas {

    private ArrayList<Artista> interpretes;

	public Artistas(ArrayList<Artista> interpretes) {
	
		setInterpretes(interpretes);
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}

	public void addInterprete(Artista interprete) {
		
		interpretes.add(interprete);
	}	
	
	public static String formattedInterpretes(ArrayList<Artista> al_interpretes){
		String s_interpretes="\ninterpretes: "+ al_interpretes.size();
		for (int i=0; i<al_interpretes.size(); i++) {
		    Artista interprete = al_interpretes.get(i);
			s_interpretes+="\n\t"+interprete.formattedArtista();
		}
			return s_interpretes;	
	}
}