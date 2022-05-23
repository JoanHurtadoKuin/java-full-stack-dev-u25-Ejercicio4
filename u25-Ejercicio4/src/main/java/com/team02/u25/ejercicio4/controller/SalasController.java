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

import com.team02.u25.ejercicio4.dto.Salas;
import com.team02.u25.ejercicio4.service.SalasServiceImpl;

@RestController
@RequestMapping("/salas")
public class SalasController {
	
	@Autowired
	SalasServiceImpl salasServiceImpl;

	@GetMapping("/")
	public List<Salas> listarsalas(){
		return salasServiceImpl.listarSalas();
	}
	
	@PostMapping("/")
	public Salas salvarsalas(@RequestBody Salas salas) {
		return salasServiceImpl.guardarSalas(salas);
	}
	
	@GetMapping("/{codigo}")
	public Salas salasXID(@PathVariable(name="codigo") int codigo) {
		
		Salas salas_xid = new Salas();
		
		salas_xid = salasServiceImpl.SalasXID(codigo);
		
		return salas_xid;
		
	}
	
	@PutMapping("/{codigo}")
	public Salas actualizarsalas(@PathVariable(name="codigo")int codigo,@RequestBody Salas salas) {
		
		Salas salas_seleccionado= new Salas();
		Salas salas_actualizado= new Salas();
		
		salas_seleccionado= salasServiceImpl.SalasXID(codigo);
		
		salas_seleccionado.setNombre(salas.getNombre());
		salas_seleccionado.setPeliculas(salas.getPeliculas());

		
		salas_actualizado = salasServiceImpl.actualizarSalas(salas_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ salas_actualizado);
		
		return salas_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eleiminarsalas(@PathVariable(name="codigo")int codigo) {
		salasServiceImpl.eliminarSalas(codigo);
	}
	
}