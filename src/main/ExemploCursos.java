package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploCursos {
	
    public static void main(String[] args) {
    	
    	List<Curso> cursos = new ArrayList<Curso>();
    	
    	cursos.add(new Curso("Python", 45));
    	cursos.add(new Curso("JavaScript", 150));
    	cursos.add(new Curso("Java 8", 113));
    	cursos.add(new Curso("C", 55));
    	
    	cursos.sort(Comparator.comparingInt(Curso::getQuantidadeAlunos));
    	
    	int sum = cursos.stream()
    				.filter(curso -> curso.getQuantidadeAlunos() >= 100)
    				.mapToInt(Curso::getQuantidadeAlunos)
    				.sum();
    	
    	cursos.stream().map(Curso::getNome);
    	
    	System.out.println(sum);
    	
    	cursos.stream()
    		.filter(curso -> curso.getQuantidadeAlunos() >= 100)
    		.findAny()
    		.ifPresent(curso -> System.out.println(curso.getNome()));
    	
    	cursos.parallelStream()
    		.filter(curso -> curso.getQuantidadeAlunos() >= 100)
    		.collect(Collectors.toMap(curso -> curso.getNome(), curso -> curso.getQuantidadeAlunos()))
    		.forEach((nome, quantidadeAlunos) -> System.out.println(nome + " tem " + quantidadeAlunos));
    	
    	cursos.stream()
    	   .filter(c -> c.getQuantidadeAlunos() > 50)
    	   .findFirst();
    	
    	double average = cursos.stream()
    		.mapToDouble(Curso::getQuantidadeAlunos)
    		.average()
    		.getAsDouble();
    	
    	System.out.println(average);
    	
    	@SuppressWarnings("unused")
		List<Curso> collect = cursos.stream()
		   .filter(c -> c.getQuantidadeAlunos() > 50)
		   .collect(Collectors.toList());
    	
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