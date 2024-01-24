package com.cursogit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cursogit.model.Curso;

@Service
public class CursosServiceImpl implements CursosService {
	
	//El constructor
	//ArrayList(Collection<? extends E> c)
	//static variables are declared using the static keyword and belong to the class itself, 
	//not to any instance of the class. They are shared among all instances of the class.
	static List<Curso> cursos = new ArrayList<>(List.of(
			new Curso("Java basico", 70, 150, "Programacion"), 
			new Curso("Python", 80, 100, "Programacion"), 
			new Curso("HTML", 50, 80, "Web"), 
			new Curso("Linux", 110, 220, "Sistemas"), 
			new Curso("Angular", 100, 170, "Web")
			));

	@Override
	public List<Curso> buscarPorTematica(String tematica) {
		return cursos.stream()
		.filter((Curso curso) -> curso.getTematica().equals(tematica))
		.toList();
	}

}
