package com.team02.u25.ejercicio4.service;

import java.util.List;

import com.team02.u25.ejercicio4.dto.Peliculas;

public interface IPeliculasService {
	
	//Metodos del CRUD
		public List<Peliculas> listarPeliculas(); 
		
		public Peliculas guardarPeliculas(Peliculas peliculas);	
		
		public Peliculas PeliculasXID(int codigo); 
		
		public Peliculas actualizarPeliculas(Peliculas peliculas); 
		
		public void eliminarPeliculas(int codigo);

}
