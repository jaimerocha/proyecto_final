package com.cursogit.service;

import java.util.List;

import com.cursogit.model.Curso;

public interface CursosService {

	public abstract List<Curso> buscarPorTematica(String tematica);
	
}
