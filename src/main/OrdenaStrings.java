package main;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public OrdenaStrings() {}

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		
		palavras.add("escola");
		palavras.add("casa");
		palavras.add("computador");
		
		palavras.sort(comparing(String::length));
		palavras.forEach(System.out::println);
		
	}
	
}