package com.team02.u25.ejercicio4.service;

import java.util.List;

import com.team02.u25.ejercicio4.dto.Salas;


public interface ISalasService {

	//Metodos del CRUD
	public List<Salas> listarSalas(); 
	
	public Salas guardarSalas(Salas salas);	
	
	public Salas SalasXID(int codigo); 
	
	public Salas actualizarSalas(Salas salas); 
	
	public void eliminarSalas(int codigo);
}
