package com.team02.u25.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u25.ejercicio4.dao.ISalasDAO;
import com.team02.u25.ejercicio4.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDAO;

	@Override
	public List<Salas> listarSalas() {

		return iSalasDAO.findAll();
	}

	@Override
	public Salas guardarSalas(Salas salas) {

		return iSalasDAO.save(salas);
	}

	@Override
	public Salas SalasXID(int codigo) {

		return iSalasDAO.findById(codigo).get();
	}

	@Override
	public Salas actualizarSalas(Salas salas) {

		return iSalasDAO.save(salas);
	}

	@Override
	public void eliminarSalas(int codigo) {
		iSalasDAO.deleteById(codigo);
	}
	
	
	
}
