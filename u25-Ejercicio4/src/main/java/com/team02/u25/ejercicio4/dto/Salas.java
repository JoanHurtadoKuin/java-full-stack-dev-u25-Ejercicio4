package com.team02.u25.ejercicio4.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "salas")
public class Salas {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name="codigo_pelicula")
    private Peliculas peliculas;
	
	public Salas() {
		
	}

	public Salas(int codigo, String nombre, String apellidos, Peliculas peliculas) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.peliculas = peliculas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Peliculas getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(Peliculas peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		return "Salas [codigo=" + codigo + ", nombre=" + nombre + ", peliculas="
				+ peliculas + "]";
	}

	
	
}
