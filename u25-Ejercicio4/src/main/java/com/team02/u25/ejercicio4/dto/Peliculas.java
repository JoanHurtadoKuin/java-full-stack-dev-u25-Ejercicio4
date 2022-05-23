package com.team02.u25.ejercicio4.dto;


import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "peliculas")
public class Peliculas {
	

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calificacion_edad")
	private int calificacion_edad;
	
    @OneToMany
    @JoinColumn(name="codigo")
    private List<Salas> salas;
    
    public Peliculas() { 
    	
    }

	public Peliculas(int codigo, String nombre, int calificacion_edad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
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

	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Salas")
	public List<Salas> getSalas() {
		return salas;
	}

	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Peliculas [codigo=" + codigo + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad + "]";
	}
	
	
    
}
