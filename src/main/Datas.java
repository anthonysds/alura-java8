package main;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public Datas() {}

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		System.out.println(hoje);
		
		LocalDate olimpiadasToquio = LocalDate.of(2020, Month.JUNE, 5);
		
		System.out.println(olimpiadasToquio);
		
		int anos = olimpiadasToquio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasToquio);
		
		System.out.println(periodo.getDays());
		
		LocalDate proximasOlimpiadas = olimpiadasToquio.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximasOlimpiadas.format(formatador);
		
		System.out.println(valorFormatado);
		
	}

}
