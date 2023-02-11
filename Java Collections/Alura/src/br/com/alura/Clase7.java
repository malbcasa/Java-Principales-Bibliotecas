package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Aula;
import modelo.Curso;

public class Clase7 {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Java",30, new ArrayList<>());
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		curso1.addAula(new Aula("Inmutable"));
		
		List<Aula> aulaList = curso1.getAulaList();
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		System.out.println(aulaList);
		
				
	}
}
