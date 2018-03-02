package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {
	
    public static void main(String[] args) {
    	
    	List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Python", 45));
    	cursos.add(new Curso("JavaScript", 150));
    	cursos.add(new Curso("Java 8", 113));
    	cursos.add(new Curso("C", 55));
    	
    	cursos.sort(Comparator.comparing(Curso::getQuantidadeAlunos));
    	
    	cursos.stream()
    		.filter(curso -> curso.getQuantidadeAlunos() > 50)
    		.map(Curso::getQuantidadeAlunos)
    		.forEach(System.out::println);
    	
    	cursos.stream().map(Curso::getNome);
    	
    	cursos.stream()
    	   .filter(curso -> curso.getQuantidadeAlunos() > 50)
    	   .map(Curso::getQuantidadeAlunos)
    	   .forEach(x -> System.out.println(x));
    	
	}
    
}

class Curso {
	
	private String nome;
    private int quantidadeAlunos;
    
    public Curso() {}

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.quantidadeAlunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
	
}