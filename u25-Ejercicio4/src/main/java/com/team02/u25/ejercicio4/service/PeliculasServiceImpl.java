package com.team02.u25.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u25.ejercicio4.dao.IPeliculasDAO;
import com.team02.u25.ejercicio4.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService{
	
	@Autowired
	IPeliculasDAO iPeliculasDAO;

	@Override
	public List<Peliculas> listarPeliculas() {

		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas guardarPeliculas(Peliculas peliculas) {

		return iPeliculasDAO.save(peliculas);
	}

	@Override
	public Peliculas PeliculasXID(int codigo) {
	
		return iPeliculasDAO.findById(codigo).get();
	}

	@Override
	public Peliculas actualizarPeliculas(Peliculas peliculas) {
		
		return iPeliculasDAO.save(peliculas);
	}

	@Override
	public void eliminarPeliculas(int codigo) {
		iPeliculasDAO.deleteById(codigo);		
	}

}
