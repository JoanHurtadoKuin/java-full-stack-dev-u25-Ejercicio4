package com.team02.u25.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team02.u25.ejercicio4.dto.Peliculas;
import com.team02.u25.ejercicio4.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
	
	@Autowired
	PeliculasServiceImpl PeliculasServiceImpl;

	@GetMapping("/")
	public List<Peliculas> listarPeliculass(){
		return PeliculasServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/")
	public Peliculas salvarPeliculas(@RequestBody Peliculas peliculas) {
		return PeliculasServiceImpl.guardarPeliculas(peliculas);
	}
	
	@GetMapping("/{codigo}")
	public Peliculas PeliculasXID(@PathVariable(name="codigo") int codigo) {
		
		Peliculas Peliculas_xid = new Peliculas();
		
		Peliculas_xid = PeliculasServiceImpl.PeliculasXID(codigo);
		
		return Peliculas_xid;
		
	}
	
	@PutMapping("/{codigo}")
	public Peliculas actualizarPeliculas(@PathVariable(name="codigo")int codigo,@RequestBody Peliculas peliculas) {
		
		Peliculas peliculas_seleccionado= new Peliculas();
		Peliculas peliculas_actualizado= new Peliculas();
		
		peliculas_seleccionado= PeliculasServiceImpl.PeliculasXID(codigo);
		
		peliculas_seleccionado.setNombre(peliculas.getNombre());
		peliculas_seleccionado.setCalificacion_edad(peliculas.getCalificacion_edad());

		
		peliculas_actualizado = PeliculasServiceImpl.actualizarPeliculas(peliculas_seleccionado);
		
		return peliculas_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eleiminarPeliculas(@PathVariable(name="codigo")int codigo) {
		PeliculasServiceImpl.eliminarPeliculas(codigo);
	}
	
}
