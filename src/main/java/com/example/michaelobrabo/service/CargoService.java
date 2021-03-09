package com.example.michaelobrabo.service;

import java.util.List;

import com.example.michaelobrabo.domain.Cargo;


public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
}
